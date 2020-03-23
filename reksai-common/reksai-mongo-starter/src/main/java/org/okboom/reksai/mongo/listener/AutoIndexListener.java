package org.okboom.reksai.mongo.listener;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.okboom.reksai.mongo.domain.IncInfo;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.index.Index;
import org.springframework.data.mongodb.core.index.IndexOperations;

/**
 * @author tookbra
 */
@Slf4j
@AllArgsConstructor
public class AutoIndexListener implements ApplicationListener<ApplicationReadyEvent> {

    private final MongoTemplate mongoTemplate;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        IndexOperations userIndexOps = mongoTemplate.indexOps(IncInfo.class);
        userIndexOps.ensureIndex(new Index().on("collectionName", Sort.Direction.ASC).unique());
    }
}
