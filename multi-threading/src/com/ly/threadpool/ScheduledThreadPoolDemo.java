package com.ly.threadpool;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.thread_pool
 * @ClassName: ScheduledThreadPoolDemo
 * @Author: lin
 * @Description: 使用ScheduledThreadPool进行定时任务调度
 * @Date: 2019-06-27 16:12
 * @Version: 1.0
 */
public class ScheduledThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);

        System.out.println("create pool time :"+System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            ThreadWorker worker = new ThreadWorker();
            // 延迟 10 秒执行
            pool.schedule(worker,10, TimeUnit.SECONDS);

        }
        pool.shutdown();
        while (!pool.isTerminated()) {

        }
        System.out.println("pool is end");
    }

}
class ThreadWorker implements Runnable {

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

class PeriodThreadPool{
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
        System.out.println("create pool time :"+System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            ThreadWorker worker = new ThreadWorker();
            // 延迟 1 秒执行后没隔 5 秒执行,将延迟视为两个任务开始之间的差异（即定期调用）
            pool.scheduleAtFixedRate(worker,2,5,TimeUnit.SECONDS);
        }
    }
}


class PeriodThreadPool2{
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
        System.out.println("create pool time :"+System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            ThreadWorker worker = new ThreadWorker();
            // 延迟 1 秒执行后没隔 5 秒执行,将延迟视为一个任务结束与下一个任务开始之间的差异
            pool.scheduleWithFixedDelay(worker,2,5,TimeUnit.SECONDS);
        }
    }
}