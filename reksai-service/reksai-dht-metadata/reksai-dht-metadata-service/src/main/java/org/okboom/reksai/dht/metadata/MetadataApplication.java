package org.okboom.reksai.dht.metadata;

import cn.hutool.core.thread.ThreadUtil;
import org.okboom.reksai.dht.metadata.task.DownloadMetadataTask;
import org.okboom.reksai.dht.node.api.domain.InfoHash;
import org.okboom.reksai.dht.node.stream.MessageStreams;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import java.util.concurrent.Executor;

/**
 * @author tookbra
 */
@EnableDiscoveryClient
@EnableBinding(MessageStreams.class)
@SpringBootApplication
public class MetadataApplication {

    private final Executor taskExecutor = ThreadUtil.newExecutorByBlockingCoefficient(0.7f);;

    public static void main(String[] args) {
        SpringApplication.run(MetadataApplication.class, args);
    }

    @StreamListener(MessageStreams.INPUT)
    public void handleMessage(InfoHash infoHash) {
        taskExecutor.execute(() -> taskExecutor.execute(new DownloadMetadataTask(infoHash)));
    }
}
