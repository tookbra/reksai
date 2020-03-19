package org.okboom.reksai.data.support;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 分页
 * @author tookbra
 */
@Data
@Accessors(chain = true)
public class Query {

    /**
     * 页码
     */
    private Integer current;

    /**
     * 查询数量
     */
    private Integer limit;

    /**
     * 排序列表
     */
    private List<SortedField> sorts;
}
