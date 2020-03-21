package org.okboom.reksai.dht.search;

import org.okboom.reksai.dht.metadata.api.domain.Metadata;
import org.okboom.reksai.dht.metadata.stream.MetadataStreams;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @author tookbra
 */
@EnableDiscoveryClient
@EnableBinding({ MetadataStreams.class })
@SpringBootApplication
public class SearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class, args);
    }

    @StreamListener(MetadataStreams.INPUT)
    public void handleMessage(Metadata metadata) {

        System.out.println(1);
    }
}
