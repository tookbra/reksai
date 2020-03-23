package org.okboom.reksai.mongo.configuration;

import com.mongodb.client.MongoClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.okboom.reksai.mongo.listener.SaveEventListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.data.mongodb.core.MongoTemplate;


/**
 * @author tookbra
 */
@Slf4j
@Order(Ordered.LOWEST_PRECEDENCE)
@AllArgsConstructor
@ConditionalOnBean(value = MongoClient.class)
@Configuration(proxyBeanMethods = false)
public class MongoConfiguration {

    @Bean()
    public SaveEventListener saveEventListener(MongoTemplate mongoTemplate) {
        return new SaveEventListener(mongoTemplate);
    }


}
