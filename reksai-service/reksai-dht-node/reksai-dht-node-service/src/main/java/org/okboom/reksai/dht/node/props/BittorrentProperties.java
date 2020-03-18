package org.okboom.reksai.dht.node.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tookbra
 */
@Data
@RefreshScope
@ConfigurationProperties(prefix = "reksai.dht.bittorrent")
public class BittorrentProperties {

    /**
     * 初始节点
     */
    private List<DhtNode> nodes = new ArrayList<>();


    /**
     * 线程休眠时间
     */
    private int threadSleep = 100;

    /**
     * 队列长度
     */
    private int queueSize = 10000;


}
