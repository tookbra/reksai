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
}
