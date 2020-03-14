package org.okboom.reksai.dht.node.util;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.socket.DatagramPacket;
import org.okboom.reksai.dht.node.util.bencode.BencodingUtils;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tookbra
 */
public class KrpcUtil {

    public static final String Y = "y";

    /**
     * 请求
     */
    public static final String QUERIES = "q";
    /**
     * 回复
     */
    public static final String RESPONSES = "r";

    public static final String ID = "id";

    /**
     * ping
     */
    public static final String PING = "ping";
    /**
     * find_node
     */
    public static final String FIND_NODE = "find_node";
    /**
     * get_peers
     */
    public static final String GET_PEERS = "get_peers";
    /**
     * announce_peer
     */
    public static final String ANNOUNCE_PEER = "announce_peer";

    /**
     * implied_port
     */
    public static final String IMPLIED_PORT = "implied_port";

    /**
     * 端口号
     */
    public static final String PORT = "PORT";


    public static DatagramPacket createPacket(byte[] t, String y, Map<String, Object> arg, InetSocketAddress address) {
        Map<String,Object> map = new HashMap<String, Object>(16);
        map.put("t", t);
        map.put("y", y);
        if (!arg.containsKey(ID)) {
            arg.put("id", NodeIdUtil.SELF_NODE_ID);
        }
        if (y.equals(QUERIES)) {
            map.put("q", t);
            map.put("a", arg);
        } else {
            map.put("r", arg);
        }
        byte[] buffer = BencodingUtils.encode(map);
        DatagramPacket packet = new DatagramPacket(Unpooled.copiedBuffer(buffer), address);
        return packet;
    }

    /**
     * 发送KRPC协议数据报文
     * @param channel
     * @param packet
     */
    public static void sendKRPC(Channel channel, DatagramPacket packet) {
        if(channel.isActive() && channel.isWritable()) {
            channel.writeAndFlush(packet);
        }
    }

}
