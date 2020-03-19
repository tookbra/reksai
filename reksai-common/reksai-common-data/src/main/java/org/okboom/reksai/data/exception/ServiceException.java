package org.okboom.reksai.data.exception;

import lombok.Getter;

/**
 * @author tookbra
 */
@Getter
public class ServiceException extends RuntimeException {

    /**
     * 错误码
     */
    private final Integer code;

    public ServiceException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
