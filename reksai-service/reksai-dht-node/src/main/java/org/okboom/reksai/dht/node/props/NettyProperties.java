package org.okboom.reksai.dht.node.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author tookbra
 */
@Data
@RefreshScope
@ConfigurationProperties(prefix = "reksai.dht.netty")
public class NettyProperties {
    /**
     * dht网络端口
     */
    private int port = 6881;

    /**
     * 接受缓冲区
     */
    private int rcvBuffer = 65536;

    /**
     * 发送缓冲区
     */
    private int sendBuffer = 65536;

    /**
     * 是否开启日志
     */
    private boolean logEnabled = false;
}
