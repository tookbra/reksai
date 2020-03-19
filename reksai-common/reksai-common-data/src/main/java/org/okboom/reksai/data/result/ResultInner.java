package org.okboom.reksai.data.result;

import lombok.*;

import java.io.Serializable;

/**
 * dubbo 返回对象
 * @author tookbra
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ResultInner<T> implements Serializable {

    private String msg;

    private boolean success;

    private T data;

    private ResultInner(ResultCode resultCode, String msg) {
        this(resultCode, null, msg);
    }

    private ResultInner(ResultCode resultCode, T data, String msg) {
        this(resultCode.getCode(), data, msg);
    }

    private ResultInner(int code, T data, String msg) {
        this.data = data;
        this.msg = msg;
        this.success = BaseResultCode.SUCCESS.code == code;
    }

    public static <T> ResultInner<T> fail(String msg) {
        return new ResultInner<>(BaseResultCode.FAILURE, msg);
    }
}
