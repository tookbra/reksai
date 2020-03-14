package org.okboom.reksai.dht.node.domain;

import java.io.Serializable;

/**
 * @author tookbra
 */
public interface Queue <T extends Serializable> {

    /**
     * 出列
     * @return
     */
    T poll();

    /**
     * 入列
     * @param message
     * @return
     */
    boolean offer(T message);

    /**
     * 队列长度
     * @return
     */
    int size();

    /**
     * 队列长度是否为0
     * @return
     */
    boolean isEmpty();
}
