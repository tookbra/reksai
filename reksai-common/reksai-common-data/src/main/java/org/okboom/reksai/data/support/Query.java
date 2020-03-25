package org.okboom.reksai.data.support;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * 分页
 * @author tookbra
 */
@Data
@Accessors(chain = true)
public class Query implements Serializable {

    /**
     * 页码
     */
    @NotNull
    private Integer current = 1;

    /**
     * 查询数量
     */
    @NotNull
    private Integer limit = 20;

    /**
     * 排序列表
     */
    private List<SortedField> sorts;
}
