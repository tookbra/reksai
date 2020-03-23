package org.okboom.reksai.mongo.annotation;

import java.lang.annotation.*;

/**
 * 自增长
 * @author tookbra
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface AutoIncValue {
}
