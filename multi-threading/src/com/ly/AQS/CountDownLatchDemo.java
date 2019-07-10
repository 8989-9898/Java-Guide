package com.ly.AQS;

import com.ly.lock.FairOrNofairLock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.AQS
 * @ClassName: CountDownLatchDemo
 * @Author: lin
 * @Description: 倒计时器的测试
 * @Date: 2019-06-28 17:07
 * @Version: 1.0
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(200);
        CountDownLatch latch=new CountDownLatch(300);
        for (int i = 0; i < 300; i++) {
            final int number=i;
            pool.execute(()->{
                try {
                    print(number);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    // 表示完成一个请求
                    latch.countDown();
                }
            });
        }

        // 阻塞达到指定线程数后，才会放行
        latch.await();
        pool.shutdown();
        System.out.println("end......");

    }
    public static void print(int i) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("模拟耗时操作："+i);
        Thread.sleep(1000);
    }
}
