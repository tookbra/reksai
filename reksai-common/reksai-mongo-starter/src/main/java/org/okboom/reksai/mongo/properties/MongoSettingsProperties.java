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
    private Integer maxConnectionIdleTime = 3000;

    /**
     * 线程等待连接变为可用的最长时间
     */
    private Integer maxWaitTime = 6000;

    /**
     * 连接超时时间
     */
    private Integer connectTimeout = 5000;


}
