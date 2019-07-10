package com.ly.AQS;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.AQS
 * @ClassName: SemaphoreDemo
 * @Author: lin
 * @Description: 使用Semaphore信号量测试
 * @Date: 2019-06-28 13:42
 * @Version: 1.0
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        // 创建一个固定线程数量的线程池
        ExecutorService pool = Executors.newFixedThreadPool(200);
        // 创建一个一次只能执行 30 个线程的信号量
        final Semaphore semaphore=new Semaphore(50);
        for (int i = 0; i < 500; i++) {
            final int number=i;
            pool.execute(()->{
                try {
                    semaphore.acquire();// 执行该方法阻塞，直到获得一个许可，才可以执行
                    print(number);
                    System.out.println("=======================风骚的分割线========================");
                    semaphore.release();// 释放一个的信号量
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        pool.shutdown();
    }

    public static void print(int i) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("模拟耗时操作："+i);
        Thread.sleep(1000);
    }

}
