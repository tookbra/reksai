package org.okboom.reksai.data.result;

import java.io.Serializable;

/**
 *
 * @author tookbra
 */
public interface ResultCode extends Serializable {

    /**
     * 获取消息
     *
     * @return
     */
    String getMessage();

    /**
     * 获取状态码
     *
     * @return
     */
    int getCode();
}
