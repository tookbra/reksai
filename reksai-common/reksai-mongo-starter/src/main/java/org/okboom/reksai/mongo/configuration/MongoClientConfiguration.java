package org.okboom.reksai.mongo.configuration;

import com.mongodb.MongoClientOptions;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.okboom.reksai.mongo.properties.MongoSettingsProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * mongodb 客户端配置
 * @author tookbra
 */
@Slf4j
@AllArgsConstructor
@Order(Ordered.HIGHEST_PRECEDENCE)
@EnableConfigurationProperties(MongoSettingsProperties.class)
@Configuration(proxyBeanMethods = false)
public class MongoClientConfiguration {

    private final MongoSettingsProperties mongoSettingsProperties;

    @Bean
    @ConditionalOnMissingBean(type = { "com.mongodb.MongoClientOptions" })
    MongoClientOptions mongoClientOptions() {
        MongoClientOptions.Builder builder = new MongoClientOptions.Builder();
        builder.connectionsPerHost(mongoSettingsProperties.getConnectionsPerHost());
        builder.minConnectionsPerHost(mongoSettingsProperties.getMinConnectionsPerHost());
        builder.maxConnectionIdleTime(mongoSettingsProperties.getMaxConnectionIdleTime());
        builder.maxConnectionLifeTime(mongoSettingsProperties.getMaxConnectionIdleTime());
        builder.maxWaitTime(mongoSettingsProperties.getMaxWaitTime());
        builder.connectTimeout(mongoSettingsProperties.getConnectTimeout());

        if (mongoSettingsProperties.getReplicaSet() != null) {
            builder.requiredReplicaSetName(mongoSettingsProperties.getReplicaSet());
        }
        MongoClientOptions mongoClientOptions = builder.build();
        return mongoClientOptions;
    }
}
