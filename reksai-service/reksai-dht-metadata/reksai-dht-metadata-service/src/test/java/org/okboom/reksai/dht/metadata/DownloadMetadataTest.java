package org.okboom.reksai.dht.metadata;

import cn.hutool.core.util.HexUtil;
import com.google.common.collect.Lists;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.socket.SocketChannel;
import lombok.SneakyThrows;
import org.junit.Test;
import org.okboom.reksai.dht.metadata.builder.BootstrapBuilder;
import org.okboom.reksai.dht.metadata.handler.MetadataHandler;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author tookbra
 */
public class DownloadMetadataTest {

    @Test
    public void testDownloadMetadata() throws InterruptedException, IOException {

        // 37.21.234.165 52449 c1b9e9acef57ff3a673b5a0324d80fc629cd3465 577b3949f1f1bbe9ebb3a6db3c870c3e9924468f
        // 51.198.90.49 26151 42d5bb189d0ce71ce66cf14220483e163805b73c 92cb7f0e2a0a00cc0f42e7acf151d5cd06eb786b

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
                pipeline.addLast("handler", new MetadataHandler(peerId, infoHash, null));
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

    @Test
    public void testConcurrentDownloadMetadata() throws IOException {
        List<String> infoHashes = Arrays.asList("42d5bb189d0ce71ce66cf14220483e163805b73c", "c1b9e9acef57ff3a673b5a0324d80fc629cd3465");
        List<String> peerIds = Arrays.asList("92cb7f0e2a0a00cc0f42e7acf151d5cd06eb786b", "577b3949f1f1bbe9ebb3a6db3c870c3e9924468f");
        List<InetSocketAddress> address = Arrays.asList(new InetSocketAddress("51.198.90.49", 26151), new InetSocketAddress("37.21.234.165", 52449));
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        BootstrapBuilder clientFactory = new BootstrapBuilder();
        for (int i = 0; i < 2; i++) {
            int finalI = i;
            executorService.execute(() ->{
                Bootstrap bootstrap = clientFactory.clone();
                bootstrap.handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ChannelPipeline pipeline = ch.pipeline();
                        pipeline.addLast("handler", new MetadataHandler(HexUtil.decodeHex(peerIds.get(finalI)), HexUtil.decodeHex(infoHashes.get(finalI)), null));
                    }
                });
                ChannelFuture f = bootstrap.connect(address.get(finalI));
                f.addListener((ChannelFutureListener) future -> {
                    if(future.isSuccess()) {
                        System.out.println("链接成功:" + finalI);
                    }
                });
            });
        }
        System.in.read();
    }
}
