package org.okboom.reksai.data.result;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Api返回对象
 * @author tookbra
 */
@Data
@ToString
public class Result<T> implements Serializable {

    /**
     * 状态码
     */
    private int code;

    /**
     * 返回对象
     */
    private T data;

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 返回消息
     */
    private String msg;

    protected Result(ResultCode resultCode, String msg) {
        this(resultCode, null, msg);
    }

    protected Result(ResultCode resultCode, T data, String msg) {
        this(resultCode.getCode(), data, msg);
    }

    protected Result(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
        this.success = BaseResultCode.SUCCESS.code == code;
    }

    /**
     * 失败
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> Result<T> fail(String msg) {
        return new Result<>(BaseResultCode.FAILURE, msg);
    }

    /**
     * 成功
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(String msg) {
        return new Result<>(BaseResultCode.SUCCESS, msg);
    }


    /**
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> data(T data) {
        return new Result<>(BaseResultCode.SUCCESS.code, data, BaseResultCode.SUCCESS.message);
    }
}
