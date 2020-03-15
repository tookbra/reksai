package org.okboom.reksai.dht.node.handler;

import cn.hutool.core.util.HexUtil;
import org.okboom.reksai.dht.node.api.domain.InfoHash;
import org.okboom.reksai.dht.node.api.domain.Node;
import org.okboom.reksai.dht.node.domain.Queue;
import org.okboom.reksai.dht.node.util.KrpcUtil;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import lombok.extern.slf4j.Slf4j;
import org.okboom.reksai.dht.node.util.NodeIdUtil;
import org.okboom.reksai.dht.node.util.bencode.BencodingUtils;

import java.math.BigInteger;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

import static org.okboom.reksai.dht.node.util.KrpcUtil.createPacket;
import static org.okboom.reksai.dht.node.util.KrpcUtil.sendKRPC;

/**
 * Bittorrent协议通道
 * @link http://www.bittorrent.org/beps/bep_0005.html
 * @author tookbra
 */
@Slf4j
@ChannelHandler.Sharable
public class DhtHandler extends SimpleChannelInboundHandler<DatagramPacket> {

    private Executor executor;

    private Queue<Node> queue;

    public DhtHandler(Executor executor, Queue queue) {
        this.executor =  executor;
        this.queue = queue;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception {
        byte[] buff = new byte[msg.content().readableBytes()];
        msg.content().readBytes(buff);

        this.executor.execute(() -> {
            Map<String, ?> map = BencodingUtils.decode(buff);

            if (map == null || map.get(KrpcUtil.Y) == null) {
                return;
            }
            String y = new String((byte[]) map.get("y"));
            if (KrpcUtil.QUERIES.equals(y)) {
                // 请求
                onQuery(ctx, map, msg.sender());
            } else if (KrpcUtil.RESPONSES.equals(y)) {
                // 回复
                onResponse(map);
            }
        });
    }

    /**
     * 请求
     * @param map
     * @param sender
     */
    private void onQuery(ChannelHandlerContext ctx, Map<String, ?> map, InetSocketAddress sender) {
        String queries = new String((byte[]) map.get(KrpcUtil.QUERIES));
        byte[] t = (byte[]) map.get("t");
        Map<String, ?> a = (Map<String, ?>)map.get("a");
        switch (queries) {
            case KrpcUtil.PING:
                onPing(ctx, t, (byte[]) a.get("id"), sender);
                break;
            case KrpcUtil.FIND_NODE:
                onFindNode(ctx, t, (byte[]) a.get("id"), sender);
                break;
            case KrpcUtil.GET_PEERS:
                onGetPeers(ctx, t, (byte[]) a.get("info_hash"), sender);
                break;
            case KrpcUtil.ANNOUNCE_PEER:
                onAnnouncePeer(ctx, t, a, sender);
                break;
            default:
                break;
        }

    }

    /**
     * 回复
     * @param map
     */
    private void onResponse(Map<String, ?> map) {
        byte[] t = (byte[]) map.get("t");
        String type = new String(t);
        if (KrpcUtil.FIND_NODE.equals(type)) {
            // find_node是我们发出的请求，不需要回复，只要把对方返回的node节点遍历请求加入对方路由表中，这样就可以找到很多朋友
            // {"t":"aa", "y":"r", "r": {"id":"0123456789abcdefghij", "nodes": "def456..."}}
            Map r = (Map)map.get("r");
            byte[] nodes = (byte[]) r.get("nodes");
            if (nodes == null) {
                return;
            }

            List<Node> nodeList = NodeIdUtil.decodeNodes(nodes);

            nodeList.forEach(node -> {
                queue.offer(node);
            });

        }
    }

    /**
     * 回复 ping 请求
     * request {"t":"aa", "y":"q", "q":"ping", "a":{"id":"abcdefghij0123456789"}}
     * response {"t":"aa", "y":"r", "r": {"id":"mnopqrstuvwxyz123456"}}
     * @param ctx
     * @param t
     * @param nid 查询者的id
     * @param sender 查询者的地址
     */
    private void onPing(ChannelHandlerContext ctx, byte[] t, byte[] nid, InetSocketAddress sender) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", NodeIdUtil.getNeighbor(nid));
        DatagramPacket packet = createPacket(t, "r", map, sender);
        sendKRPC(ctx.channel(), packet);
    }

    /**
     * 回复 find_node 请求
     * request {"t":"aa", "y":"q", "q":"find_node", "a": {"id":"abcdefghij0123456789", "target":"mnopqrstuvwxyz123456"}}
     * response {"t":"aa", "y":"r", "r": {"id":"0123456789abcdefghij", "nodes": "def456..."}}
     * @param ctx
     * @param t
     * @param nid 查询者的id
     * @param sender 查询者的地址
     */
    private void onFindNode(ChannelHandlerContext ctx, byte[] t, byte[] nid, InetSocketAddress sender) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", NodeIdUtil.getNeighbor(nid));
        map.put("nodes", new byte[]{});
        DatagramPacket packet = createPacket(t, "r", map, sender);
        sendKRPC(ctx.channel(), packet);
    }

    /**
     * 回复 getPeers 请求
     * request  {"t":"aa", "y":"q", "q":"get_peers", "a": {"id":"abcdefghij0123456789", "info_hash":"mnopqrstuvwxyz123456"}}
     * response {"t":"aa", "y":"r", "r": {"id":"abcdefghij0123456789", "token":"aoeusnth", "values": ["axje.u", "idhtnm"]}}
     * @param ctx
     * @param t
     * @param infoHash 查询者的id
     * @param sender 查询者的地址
     */
    private void onGetPeers(ChannelHandlerContext ctx, byte[] t, byte[] infoHash, InetSocketAddress sender) {
        Map<String, Object> r = new HashMap<>(10);
        r.put("token", new byte[]{infoHash[0], infoHash[1]});
        r.put("nodes", new byte[]{});
        r.put("id", NodeIdUtil.getNeighbor(infoHash));
        DatagramPacket packet = createPacket(t, "r", r, sender);
        sendKRPC(ctx.channel(), packet);
    }

    /**
     * 回复 announce_peer 请求
     * request {"t":"aa", "y":"q", "q":"announce_peer", "a": {"id":"abcdefghij0123456789", "implied_port": 1, "info_hash":"mnopqrstuvwxyz123456", "port": 6881, "token": "aoeusnth"}}
     * response {"t":"aa", "y":"r", "r": {"id":"mnopqrstuvwxyz123456"}}
     * @param ctx
     * @param t
     * @param map
     * @param sender 查询者的地址
     */
    private void onAnnouncePeer(ChannelHandlerContext ctx, byte[] t, Map map, InetSocketAddress sender) {
        byte[] infoHash = (byte[]) map.get("info_hash");
        byte[] token = (byte[]) map.get("token");
        byte[] nid = (byte[]) map.get("id");
        if(token.length != 2 || infoHash[0] != token[0] || infoHash[1] != token[1]) {
            return;
        }

        int port;
        if(map.containsKey(KrpcUtil.IMPLIED_PORT) && ((BigInteger) map.get(KrpcUtil.IMPLIED_PORT)).intValue() != 0) {
            port = sender.getPort();
        } else {
            if(null == map.get(KrpcUtil.PORT)) {
                return;
            }
            port = ((BigInteger) map.get(KrpcUtil.PORT)).intValue();
        }

        Map<String, Object> r = new HashMap<>(16);
        byte[] nodeId = NodeIdUtil.getNeighbor(nid);
        r.put("id", nodeId);
        DatagramPacket packet = createPacket(t, "r", r, sender);
        sendKRPC(ctx.channel(), packet);

        log.error("announce_peer request, host:{}, port:{} - info_hash:{}", sender.getHostString(), port, HexUtil.encodeHexStr(infoHash));
        // push to kafka
        InfoHash.builder().address(sender.getHostString()).port(port).nid(nodeId).infoHash(infoHash).build();

    }
}
