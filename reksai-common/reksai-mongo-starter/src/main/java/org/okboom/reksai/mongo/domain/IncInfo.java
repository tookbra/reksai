package org.okboom.reksai.mongo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * 自增表
 * @author tookbra
 */
@Data
@Document(collection = "inc")
public class IncInfo implements Serializable {

    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 表名
     */
    @Field
    private String collectionName;

    /**
     * 自增value
     */
    @Field
    private Integer inc;
}
