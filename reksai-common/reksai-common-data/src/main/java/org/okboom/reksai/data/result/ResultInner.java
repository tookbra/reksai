package org.okboom.reksai.data.result;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * dubbo 返回对象
 * @author tookbra
 */
@Data
@ToString
public class ResultInner<T> implements Serializable {

    private String msg;

    private T data;
}
