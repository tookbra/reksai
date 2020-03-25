package org.okboom.reksai.dht.web;

import org.okboom.reksai.dht.web.thymeleaf.dialect.FileSizeDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * @author tookbra
 */
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }


    @Bean
    @ConditionalOnMissingBean
    public FileSizeDialect wlfDialect() {
        return new FileSizeDialect();
    }
}
