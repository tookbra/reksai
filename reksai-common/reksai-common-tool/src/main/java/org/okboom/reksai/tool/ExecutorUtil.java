package org.okboom.reksai.tool;

import cn.hutool.core.thread.ExecutorBuilder;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author tookbra
 */
public class ExecutorUtil {

    /**
     * 获得一个新的线程池<br>
     * 传入阻塞系数，线程池的大小计算公式为：CPU可用核心数 / (1 - 阻塞因子)<br>
     * Blocking Coefficient(阻塞系数) = 阻塞时间／（阻塞时间+使用CPU的时间）<br>
     * 计算密集型任务的阻塞系数为0，而IO密集型任务的阻塞系数则接近于1。
     * <p>
     * see: http://blog.csdn.net/partner4java/article/details/9417663
     *
     * @param blockingCoefficient 阻塞系数，阻塞因子介于0~1之间的数，阻塞因子越大，线程池中的线程数越多。
     * @param workQueue 队列
     * @return {@link ThreadPoolExecutor}
     * @since 3.0.6
     */
    public static ThreadPoolExecutor newExecutorByBlockingCoefficient(float blockingCoefficient, BlockingQueue<Runnable> workQueue) {
        if (blockingCoefficient >= 1 || blockingCoefficient < 0) {
            throw new IllegalArgumentException("[blockingCoefficient] must between 0 and 1, or equals 0.");
        }

        // 最佳的线程数 = CPU可用核心数 / (1 - 阻塞系数)
        int poolSize = (int) (Runtime.getRuntime().availableProcessors() / (1 - blockingCoefficient));
        return ExecutorBuilder.create().setWorkQueue(workQueue).setCorePoolSize(poolSize).setMaxPoolSize(poolSize).setKeepAliveTime(0L).build();
    }
}
