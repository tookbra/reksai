package org.okboom.reksai.dht.metadata.builder;

import cn.hutool.core.thread.ThreadUtil;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author tookbra
 */
public class BootstrapBuilder {

    private final Bootstrap bootstrap;
    private final AtomicInteger threadNumber = new AtomicInteger(1);

    public BootstrapBuilder() {
        EventLoopGroup workgroup = new NioEventLoopGroup(1,
                ThreadUtil.newNamedThreadFactory("workGroup-" + threadNumber.getAndIncrement() + "-", true));
        this.bootstrap = new Bootstrap()
                .group(workgroup)
                .channel(NioSocketChannel.class)
                // 禁用Nagle算法
                .option(ChannelOption.TCP_NODELAY, true)
                // 连接超时时间
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 5000)
                // I/O操作完成的最大毫秒数, 如果在指定
                .option(ChannelOption.SO_TIMEOUT, 5000)
                // 接受缓冲区大小
                .option(ChannelOption.SO_RCVBUF, 4096)
                // 关闭延时
                .option(ChannelOption.SO_LINGER, 0)
                // 地址复用
                .option(ChannelOption.SO_REUSEADDR, true);
    }

    @Override
    public Bootstrap clone() {
        return bootstrap.clone();
    }
}
