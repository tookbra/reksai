package org.okboom.reksai.dht.metadata.task;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.okboom.reksai.dht.metadata.builder.BootstrapBuilder;
import org.okboom.reksai.dht.metadata.handler.MetadataHandler;
import org.okboom.reksai.dht.metadata.stream.MetadataStreams;
import org.okboom.reksai.dht.node.api.domain.InfoHash;

import java.net.InetSocketAddress;

/**
 * @author tookbra
 */
@Slf4j
public class DownloadMetadataTask implements Runnable {

    private InfoHash infoHash;

    private MetadataStreams metadataStreams;

    public DownloadMetadataTask(InfoHash infoHash, MetadataStreams metadataStreams) {
        this.infoHash = infoHash;
    }

    @SneakyThrows
    @Override
    public void run() {
        BootstrapBuilder clientFactory = new BootstrapBuilder();
        Bootstrap bootstrap = clientFactory.clone();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(infoHash.getAddress(), infoHash.getPort());
        bootstrap.handler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel ch) throws Exception {
                ChannelPipeline pipeline = ch.pipeline();
                pipeline.addLast("handler", new MetadataHandler(infoHash.getNid(), infoHash.getInfoHash(), metadataStreams));
            }
        });
        ChannelFuture f = bootstrap.connect(inetSocketAddress);
        f.addListener((ChannelFutureListener) future -> {
            if(future.isSuccess()) {
                log.info("begin to download infoHash: {}, {}:{} connection successful",
                        infoHash.getInfoHash(), infoHash.getAddress(), infoHash.getPort());
            }
        }).sync();
    }
}
