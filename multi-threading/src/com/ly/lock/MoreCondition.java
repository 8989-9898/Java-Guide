package com.ly.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.lock
 * @ClassName: MoreCondition
 * @Author: lin
 * @Description: 使用多个Condition进行多个线程之间的通讯
 * @Date: 2019-06-27 10:40
 * @Version: 1.0
 */
public class MoreCondition {
    public static void main(String[] args) throws InterruptedException {
        MoreService service = new MoreService();
        Thread thread1=new Thread(()->{service.waitA();});
        Thread thread2=new Thread(()->{service.waitA();});
        Thread thread3=new Thread(()->{service.waitB();});
        thread1.start();
        thread2.start();
        thread3.start();
        // 唤醒 A 条件的所有线程
        Thread.sleep(5000);
        service.signalAll_A();
    }
}

class MoreService {
    private Lock lock = new ReentrantLock();
    private Condition A = lock.newCondition();
    private Condition B = lock.newCondition();

    public void waitA() {
        try {
            lock.lock();
            System.out.println("A Thread start wait:" + System.currentTimeMillis());
            A.await();
            System.out.println("A Thread end wait:" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void waitB() {
        try {
            lock.lock();
            System.out.println("B Thread start wait:" + System.currentTimeMillis());
            B.await();
            System.out.println("B Thread end wait:" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_A() {
        try {
            lock.lock();
            System.out.println("A Thread start signal:" + System.currentTimeMillis());
            // 唤醒所有正在等待该通知的线程
            A.signalAll();
            Thread.sleep(2000);
            System.out.println("A Thread end signal , after five seconds::" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_B() {
        try {
            lock.lock();
            System.out.println("B Thread start signal:" + System.currentTimeMillis());
            // 唤醒所有正在等待该通知的线程
            B.signalAll();
            Thread.sleep(2000);
            System.out.println("B Thread end signal , after five seconds:" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
