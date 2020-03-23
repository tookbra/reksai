package org.okboom.reksai.mongo.listener;

import lombok.extern.slf4j.Slf4j;
import org.okboom.reksai.mongo.annotation.AutoIncValue;
import org.okboom.reksai.mongo.domain.IncInfo;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;


/**
 * @author tookbra
 */
@Component
@Slf4j
public class SaveEventListener extends AbstractMongoEventListener<Object> {

    private final MongoTemplate mongoTemplate;

    public SaveEventListener(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Object> event) {
        final Object source = event.getSource();
        if (source != null) {
            ReflectionUtils.doWithFields(source.getClass(), field -> {
                ReflectionUtils.makeAccessible(field);
                if (field.isAnnotationPresent(AutoIncValue.class)) {
                    field.set(source, getNextValue(source.getClass().getSimpleName()));
                }
            });
        }
    }

    private Integer getNextValue(String collName) {
        Query query = new Query(Criteria.where("collectionName").is(collName));
        Update update = new Update();
        update.inc("inc", 1);
        FindAndModifyOptions options = new FindAndModifyOptions();
        options.upsert(true);
        options.returnNew(true);
        IncInfo incInfo = mongoTemplate.findAndModify(query, update, options, IncInfo.class);
        return incInfo.getInc();
    }
}
