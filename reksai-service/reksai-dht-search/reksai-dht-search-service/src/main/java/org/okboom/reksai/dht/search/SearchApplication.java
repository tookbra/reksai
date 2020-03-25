package org.okboom.reksai.dht.search;

import lombok.AllArgsConstructor;
import org.okboom.reksai.dht.metadata.api.domain.Metadata;
import org.okboom.reksai.dht.metadata.stream.MetadataStreams;
import org.okboom.reksai.dht.search.domain.Torrent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.event.EventListener;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.index.Index;
import org.springframework.data.mongodb.core.index.IndexOperations;

/**
 * @author tookbra
 */
@AllArgsConstructor
@EnableDiscoveryClient
@EnableBinding({ MetadataStreams.class })
@SpringBootApplication
public class SearchApplication {

    private final MongoTemplate mongoTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class, args);
    }

    @StreamListener(MetadataStreams.INPUT)
    public void handleMessage(Metadata metadata) {

        System.out.println(1);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void initIndicesAfterStartup() {
        IndexOperations userIndexOps = mongoTemplate.indexOps(Torrent.class);
        userIndexOps.ensureIndex(new Index().on("summary", Sort.Direction.ASC).unique());
    }
}
