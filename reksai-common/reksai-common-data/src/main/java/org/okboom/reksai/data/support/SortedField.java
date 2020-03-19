package org.okboom.reksai.data.support;

import lombok.Data;

/**
 * 排序对象
 * @author tookbra
 */
@Data
public class SortedField {
    /**
     * 字段
     */
    private String field;
    /**
     * 排序
     */
    private String order;
}
