package org.okboom.reksai.job.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author tookbra
 */
@Data
@Component
@ConfigurationProperties(prefix = "reksai.xxl.job")
public class XxlJobProperties {

    /**
     * 调度中心配置
     */
    private XxlAdminProperties admin = new XxlAdminProperties();

    /**
     * 执行器配置
     */
    private XxlExecutorProperties executor = new XxlExecutorProperties();
}
