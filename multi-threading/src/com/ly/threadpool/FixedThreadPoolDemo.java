package com.ly.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.thread_pool
 * @ClassName: FixedThreadPoolDemo
 * @Author: lin
 * @Description: 使用FixedThreadPool测试固定线程数的线程池
 * @Date: 2019-06-27 15:41
 * @Version: 1.0
 */
public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            ThreadWorker worker = new ThreadWorker();
            pool.execute(worker);
        }
        // 关闭线程池，但是线程池内的任务不后立即停止，而是在执行完线程池内的任务后在关闭
        pool.shutdown();
        // 判断线程池是否关闭
        while (!pool.isTerminated()) {
        }
        System.out.println("pool is shutdown");
    }

    public static class ThreadWorker implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " start time:" + System.currentTimeMillis());
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " end time:" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
