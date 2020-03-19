package org.okboom.reksai.dht.node;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.okboom.reksai.dht.node.api.domain.Node;
import org.okboom.reksai.dht.node.domain.Queue;
import org.okboom.reksai.dht.node.stream.InfoHashStreams;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author tookbra
 */
@Slf4j
@AllArgsConstructor
@EnableDiscoveryClient
@EnableBinding(InfoHashStreams.class)
@SpringBootApplication(scanBasePackages = "org.okboom.reksai")
public class DhtNodeApplication implements CommandLineRunner {

    private final DhtNodeServer dhtNodeServer;

    private final Queue<Node> queue;

    public static void main(String[] args) {
        SpringApplication.run(DhtNodeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        dhtNodeServer.run();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> dhtNodeServer.shutdown()));
    }

    /**
     * 加入dht网络定时任务
     * 第一次执行后延迟10秒再执行， 上一次执行完毕60秒后再执行
     */
    @Scheduled(fixedDelay = 60 * 1000, initialDelay = 10 * 1000)
    public void joinDhtTask() {
        if(queue.isEmpty()) {
            log.info("本地 DHT 节点数为0，自动重新加入 DHT 网络中...");
            dhtNodeServer.joinDht();
        }
    }

}
