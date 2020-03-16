package org.okboom.reksai.dht.metadata;

import cn.hutool.core.util.HexUtil;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.socket.SocketChannel;
import org.okboom.reksai.dht.metadata.factory.BootstrapBuilder;
import org.okboom.reksai.dht.metadata.handler.MetadataHandler;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @author tookbra
 */
public class DownloadMetadataTest {

    public static void main(String[] args) throws InterruptedException, IOException {

        byte [] infoHash = HexUtil.decodeHex("42d5bb189d0ce71ce66cf14220483e163805b73c");
        byte [] peerId = HexUtil.decodeHex("92cb7f0e2a0a00cc0f42e7acf151d5cd06eb786b");
        BootstrapBuilder clientFactory = new BootstrapBuilder();
        Bootstrap bootstrap = clientFactory.clone();
        InetSocketAddress inetSocketAddress = new InetSocketAddress("51.198.90.49", 26151);
        bootstrap.handler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel ch) throws Exception {
                ChannelPipeline pipeline = ch.pipeline();
//                pipeline.addLast("logger", new LoggingHandler(LogLevel.INFO));
                pipeline.addLast("handler", new MetadataHandler(peerId, infoHash));
            }
        });
        ChannelFuture f = bootstrap.connect(inetSocketAddress);
        f.addListener((ChannelFutureListener) future -> {
            if(future.isSuccess()) {
                System.out.println("链接成功");
            }
        }).sync();
        System.in.read();
    }
}
