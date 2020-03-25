package org.okboom.reksai.transfer;

import lombok.AllArgsConstructor;
import org.okboom.reksai.job.annotation.EnableXxlJob;
import org.okboom.reksai.dht.domain.Torrent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.index.Index;
import org.springframework.data.mongodb.core.index.IndexOperations;

/**
 * @author tookbra
 */
@AllArgsConstructor
@EnableXxlJob
@SpringBootApplication(scanBasePackages = "org.okboom.reksai")
public class TransferApplication {

    private final MongoTemplate mongoTemplate;

    public static void main(String[] args) {
        SpringApplication.run(TransferApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void initIndicesAfterStartup() {
        IndexOperations userIndexOps = mongoTemplate.indexOps(Torrent.class);
        userIndexOps.ensureIndex(new Index().on("infoHash", Sort.Direction.ASC).unique());
    }
}
