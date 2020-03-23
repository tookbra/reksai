package org.okboom.reksai.monitor.configuration;

import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
import org.okboom.reksai.monitor.notify.DingTalkNotifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author tookbra
 */
@Configuration(proxyBeanMethods = false)
public class DingTalkNotifierConfiguration {

    /**
     * 参考 {@link de.codecentric.boot.admin.server.notify }
     * @param repository
     * @return
     */
    @Bean
    @ConditionalOnMissingBean
    @ConfigurationProperties("spring.boot.admin.notify.dingtalk")
    public DingTalkNotifier dingTalkNotifier(InstanceRepository repository) {
        return new DingTalkNotifier(repository);
    }
}
