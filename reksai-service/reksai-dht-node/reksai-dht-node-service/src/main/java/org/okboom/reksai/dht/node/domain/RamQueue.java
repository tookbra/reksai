package org.okboom.reksai.dht.node.domain;

import org.okboom.reksai.dht.node.api.domain.Node;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 内存队列
 * @author tookbra
 */
public class RamQueue implements Queue<Node> {

    public BlockingQueue<Node> queue;

    public RamQueue(int queueSize) {
        queue = new LinkedBlockingQueue(queueSize);
    }

    @Override
    public Node poll() {
        return queue.poll();
    }

    @Override
    public boolean offer(Node message) {
        return queue.offer(message);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
