package org.okboom.reksai.data.result;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * 分页返回对象
 * @author tookbra
 */
@Data
@ToString
public class PageResult<T> extends Result<T> {

    private Pager pager;

    public PageResult() {}

    private PageResult(ResultCode resultCode, String msg) {
        super(resultCode, null, msg);
    }

    private PageResult(ResultCode resultCode, T data, String msg) {
        super(resultCode.getCode(), data, msg);
    }

    private PageResult(int code, T data, String msg) {
        super(code, data, msg);
    }

    private PageResult(T data, Pager pager) {
        super(BaseResultCode.SUCCESS.code, data, BaseResultCode.SUCCESS.message);
        this.pager = pager;
    }



    /**
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> PageResult<T> empty(T data) {
        return new PageResult<>(BaseResultCode.SUCCESS.code, data, BaseResultCode.SUCCESS.message);
    }

    /**
     *
     * @param data
     * @param pager
     * @param <T>
     * @return
     */
    public static <T> PageResult<T> data(T data, Pager pager) {
        return new PageResult<>(data, pager);
    }

}
