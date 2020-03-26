package org.okboom.reksai.mongo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author tookbra
 */
@Data
@ConfigurationProperties(prefix = "spring.data.mongodb.custom")
public class MongoSettingsProperties {

    @NotBlank
    private String database;

    @NotEmpty
    private List<String> hosts;

    @NotEmpty
    private List<Integer> ports;

    private String replicaSet;
    private String username;
    private String password;
    private String authenticationDatabase;
    private Integer minConnectionsPerHost = 10;
    private Integer connectionsPerHost = 50;
    /**
     * 连接池中连接的最大空闲时间（毫秒）。超出空闲时间的连接将被关闭，并在必要时由新建连接替换
     */
    private Integer maxConnectionIdleTime = 60000;

    /**
     * 线程等待连接变为可用的最长时间
     */
    private Integer maxWaitTime = 6000;

    /**
     * 连接超时时间
     */
    private Integer connectTimeout = 5000;


}
