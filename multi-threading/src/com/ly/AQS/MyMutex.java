package com.ly.AQS;

import java.io.Serializable;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.AQS
 * @ClassName: MyMutex
 * @Author: lin
 * @Description: 使用AbstractQueuedSynchronizer实现自定义独占锁
 * @Date: 2019-06-28 11:03
 * @Version: 1.0
 */
public class MyMutex implements Serializable {

    /**
     * 静态内部类，继承AQS重写独占锁的方法
     */
    private static class Sync extends AbstractQueuedSynchronizer {
        /**
         * 是否处于独占状态
         *
         * @return
         */
        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }

        /**
         * 获取资源（锁）
         * 当状态为0的时候获取锁，CAS操作成功，则state状态为1，
         *
         * @param arg
         * @return
         */
        @Override
        protected boolean tryAcquire(int arg) {
            if (compareAndSetState(0, 1)) {
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        /**
         * 释放资源（锁）为 0 时表示释放锁完成
         *
         * @param arg
         * @return
         */
        @Override
        protected boolean tryRelease(int arg) {
            if (getState() == 0) {
                throw new IllegalMonitorStateException();
            }
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }
    }

    private final Sync sync = new Sync();

    public void lock() {
        sync.acquire(1);
    }

    public void unlock() {
        sync.release(1);
    }

    public boolean tryLock() {
        return sync.tryAcquire(1);
    }

    public boolean isUnlock() {
        return sync.isHeldExclusively();
    }
}


class MyMutexTest {
    // 30个子线程加一个主线程
    private static CyclicBarrier barrier = new CyclicBarrier(31);
    private static int a = 0;
    private static MyMutex mutex = new MyMutex();

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        // 没有加锁的
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    increment();
                }
                try {
                    barrier.await();// 等待 30 个线程加载完毕
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        barrier.await();
        System.out.println("没有加锁：" + a);
        barrier.reset();
        a = 0;
        // 加锁的
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    increment1();
                }
                try {
                    barrier.await();// 等待 30 个线程加载完毕
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        barrier.await();
        System.out.println("加锁：" + a);
    }

    /**
     * 没有使用自定义的锁同步的
     */
    public static void increment() {
        a++;
    }

    /**
     * 使用自定义的锁同步的
     */
    public static void increment1() {
        mutex.lock();
        a++;
        mutex.unlock();
    }
}
