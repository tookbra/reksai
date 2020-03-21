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


    /**
     * 总数
     */
    private Long total = 0L;

    /**
     * 当前页
     */
    private Long current = 1L;

    /**
     * 总页数
     */
    private Long size;

    private PageResult(ResultCode resultCode, String msg) {
        super(resultCode, null, msg);
    }

    private PageResult(ResultCode resultCode, T data, String msg) {
        super(resultCode.getCode(), data, msg);
    }

    private PageResult(int code, T data, String msg) {
        super(code, data, msg);
    }

    private PageResult(T data, Long current, Long total) {
        super(BaseResultCode.SUCCESS.code, data, BaseResultCode.SUCCESS.message);
        this.current = current;
        this.total = total;
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
     * @param current
     * @param total
     * @param <T>
     * @return
     */
    public static <T> PageResult<T> data(T data, Long current, Long total) {
        return new PageResult<>(data, current, total);
    }

}
