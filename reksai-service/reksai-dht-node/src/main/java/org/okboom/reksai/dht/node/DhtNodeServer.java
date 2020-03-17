package org.okboom.reksai.dht.node;

import cn.hutool.core.thread.ThreadUtil;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.okboom.reksai.dht.node.api.domain.Node;
import org.okboom.reksai.dht.node.domain.Queue;
import org.okboom.reksai.dht.node.handler.BlackHoleHandler;
import org.okboom.reksai.dht.node.handler.DhtHandler;
import org.okboom.reksai.dht.node.props.BittorrentProperties;
import org.okboom.reksai.dht.node.props.NettyProperties;
import org.okboom.reksai.dht.node.stream.MessageStreams;
import org.okboom.reksai.dht.node.util.KrpcUtil;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.DatagramChannel;
import io.netty.channel.socket.DatagramPacket;
import io.netty.channel.socket.nio.NioDatagramChannel;
import lombok.extern.slf4j.Slf4j;
import org.okboom.reksai.dht.node.util.NodeIdUtil;
import org.okboom.reksai.tool.ExecutorUtil;
import org.okboom.reksai.tool.NetUtils;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

import static org.okboom.reksai.dht.node.util.KrpcUtil.createPacket;
import static org.okboom.reksai.dht.node.util.KrpcUtil.sendKRPC;

/**
 * Dht服务节点
 * @author tookbra
 */
@Slf4j
public class DhtNodeServer {

    private EventLoopGroup workgroup = new NioEventLoopGroup(0, ThreadUtil.newNamedThreadFactory("workGroup-", true));
    private Channel channel;

    private final Executor taskExecutor;

    private final BittorrentProperties bittorrentProperties;

    private final NettyProperties nettyProperties;

    private final MessageStreams messageStreams;

    /**
     * dht节点队列
     */
    private Queue<Node> queue;

    public DhtNodeServer(BittorrentProperties bittorrentProperties, NettyProperties nettyProperties, Queue queue,
                         MessageStreams messageStreams) {
        this.nettyProperties = nettyProperties;
        this.bittorrentProperties = bittorrentProperties;
        BlockingQueue<Runnable> workQueue = new LinkedBlockingDeque<>(bittorrentProperties.getQueueSize());
        this.taskExecutor = ExecutorUtil.newExecutorByBlockingCoefficient(0.7f, workQueue);
        this.queue = queue;
        this.messageStreams = messageStreams;
    }

    /**
     * 启动dht node服务
     * @throws InterruptedException
     */
    public void run() throws InterruptedException {
        int port = NetUtils.getAvailablePort(nettyProperties.getPort());
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(workgroup)
                .channel(NioDatagramChannel.class)
                // 接收缓冲区
                .option(ChannelOption.SO_RCVBUF, nettyProperties.getRcvBuffer())
                // 发送缓冲区
                .option(ChannelOption.SO_SNDBUF, nettyProperties.getSendBuffer())
                // 使用PooledByteBufAllocator来管理内存
                .option(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT)
                // 允许广播
                .option(ChannelOption.SO_BROADCAST, true)
                .handler(initPipeLine());
        ChannelFuture future = bootstrap.bind(port).sync();
        channel = future.channel();
        channel.closeFuture();

        future.channel().closeFuture().addListener((ChannelFutureListener) f -> {
            log.info("future channel close");
        });
        future.addListener(f -> {
            if(f.isSuccess()) {
                log.info("server start success on:{}", port);
                ThreadUtil.execute(() -> {
                    try {
                        while (true) {
                            Node node = queue.poll();
                            if (node != null) {
                                findNode(node.getAddress(), node.getNid(), NodeIdUtil.generateRandomNodeId());
                            }
                            Thread.sleep(bittorrentProperties.getThreadSleep());
                        }
                    } catch (Exception e) {
                    }
                });
            } else {
                log.error("server start failure: {}", future.cause());
            }
        });

    }

    /**
     * 优雅关闭netty
     */
    public void shutdown() {
        try {
            channel.close();
            if (!workgroup.isShutdown()) {
                workgroup.shutdownGracefully();
                workgroup.terminationFuture().sync();
                workgroup = null;
            }
            log.info("shutdown dht server successful");
        } catch (InterruptedException e) {
            log.error("shutdown dht server gracefully failure: {}", e.getMessage());
        }
    }


    /**
     * 加入dht节点
     */
    public void joinDht() {
        bittorrentProperties.getNodes().forEach(node -> {
            InetSocketAddress address = new InetSocketAddress(node.getAddress(), node.getPort());
            this.findNode(address, null, NodeIdUtil.SELF_NODE_ID);
        });

    }

    /**
     * 发送 dht 请求
     * @param address 地址
     * @param nid 本节点nodeId
     * @param target 目标nodeId
     */
    private void findNode(InetSocketAddress address, byte[] nid, byte[] target) {
        Map<String, Object> map = new HashMap<>(16);
        map.put("target", target);
        if (nid != null) {
            map.put("id", NodeIdUtil.getNeighbor(target));
        }
        DatagramPacket packet = createPacket(KrpcUtil.FIND_NODE.getBytes(), KrpcUtil.QUERIES, map, address);
        sendKRPC(channel, packet);
    }

    /**
     * 初始化netty管道
     * @return
     */
    private ChannelHandler initPipeLine() {
        return new ChannelInitializer<DatagramChannel>() {
            @Override
            protected void initChannel(DatagramChannel datagramChannel) {
                ChannelPipeline channelPipeline = datagramChannel.pipeline();
                if(nettyProperties.isLogEnabled()) {
                    channelPipeline.addLast("logger", new LoggingHandler(LogLevel.INFO));
                }
                channelPipeline.addLast("dhtHandler", new DhtHandler(taskExecutor, queue, messageStreams));
                channelPipeline.addLast("blackHoleHandler",new BlackHoleHandler());
            }
        };
    }
}
