package org.okboom.reksai.data.result;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author tookbra
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Pager implements Serializable {


    /**
     * 总数
     */
    private long total;

    /**
     * 当前页
     */
    private int pageNum;

    /**
     * 总页数
     */
    private int size;

    /**
     * 总页数
     */
    private int totalPage;

    /**
     *
     * @param pageNum
     * @param total
     */
    public Pager(int pageNum, long total, int totalPage) {
        this.pageNum = pageNum;
        this.total = total;
        this.totalPage = totalPage;
    }
}
