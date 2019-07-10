package com.ly.lock;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.lock
 * @ClassName: ConditionSequence
 * @Author: lin
 * @Description: 使用condition实现线程按顺序输出
 * @Date: 2019-06-27 10:53
 * @Version: 1.0
 */
public class ConditionSequence {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        Thread a=new Thread(()->{sequence.waitA();});
        Thread b=new Thread(()->{sequence.waitB();});
        Thread c=new Thread(()->{sequence.waitC();});

        Thread[] as=new Thread[5];
        Thread[] bs=new Thread[5];
        Thread[] cs=new Thread[5];
        for (int i = 0; i < 5; i++) {
            as[i]=new Thread(a);
            bs[i]=new Thread(b);
            cs[i]=new Thread(c);
            as[i].start();
            bs[i].start();
            cs[i].start();
        }
    }
}

class Sequence {
    private Lock lock = new ReentrantLock();
    private Condition a = lock.newCondition();
    private Condition b = lock.newCondition();
    private Condition c = lock.newCondition();
    volatile public int number = 1;

    public void waitA() {
        try {
            lock.lock();
            while (number != 1) {
                a.await();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("我是老大我先执行：" + i);
            }
            number = 2;
            // 老大执行完了通知老二执行
            b.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void waitB() {
        try {
            lock.lock();
            while (number != 2) {
                b.await();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("我是老二我第二个执行：" + i);
            }
            number = 3;
            // 老二执行完了通知老三执行
            c.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void waitC() {
        try {
            lock.lock();
            while (number != 3) {
                c.await();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("我是老幺我断后：" + i);
            }
            number = 1;
            // 老三执行完了通知老大执行
            a.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
