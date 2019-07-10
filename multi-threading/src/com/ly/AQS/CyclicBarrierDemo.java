package com.ly.AQS;

import java.util.concurrent.*;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.AQS
 * @ClassName: CyclicBarrierDemo
 * @Author: lin
 * @Description: 循环栅栏测试
 * @Date: 2019-06-28 17:19
 * @Version: 1.0
 */
public class CyclicBarrierDemo {

    /**
     * 需要同步的线程数
     */
    // private static final CyclicBarrier BARRIER = new CyclicBarrier(5);

    private static final CyclicBarrier BARRIER = new CyclicBarrier(5,()->{
        System.out.println("当拦截的线程数达到 5 个之后，我先执行------------------");
    });
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 200; i++) {
            int number = i;
            pool.execute(() -> {
                try {
                    print(number);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        pool.shutdown();
    }

    public static void print(int i) throws InterruptedException {
        try {
            System.out.println("thread-" + i + "start----");
            // 阻塞线程，在线程数达到 5 个或者在 2 秒钟之后就会执行
            BARRIER.await(2000, TimeUnit.MILLISECONDS);
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println("thread-" + i + " end======");
    }
}
