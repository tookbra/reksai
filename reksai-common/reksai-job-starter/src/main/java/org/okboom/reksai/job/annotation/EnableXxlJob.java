package org.okboom.reksai.job.annotation;

import org.okboom.reksai.job.configuration.XxlJobAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 是否开启xxl-job
 * @author tookbra
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({XxlJobAutoConfiguration.class})
public @interface EnableXxlJob {
}
