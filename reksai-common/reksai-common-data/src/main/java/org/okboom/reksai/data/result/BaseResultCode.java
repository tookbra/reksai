package org.okboom.reksai.data.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author tookbra
 */
@Getter
@AllArgsConstructor
public enum BaseResultCode implements ResultCode {

    /**
     * 操作成功
     */
    SUCCESS(200, "操作成功"),

    /**
     * 业务异常
     */
    FAILURE(500, "业务异常");

    /**
     * 代码
     */
    final int code;
    /**
     * 信息描述
     */
    final String message;
}
