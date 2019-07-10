package com.ly.lock;

import sun.security.provider.Sun;

import java.util.TreeMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.lock
 * @ClassName: SingleCondition
 * @Author: lin
 * @Description: 使用单个的Condition实现线程通知和等待
 * @Date: 2019-06-27 10:24
 * @Version: 1.0
 */
public class SingleCondition {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.signal();

    }

    public static class ThreadA extends Thread{
        private Service service;

        public ThreadA(Service service) {
            this.service = service;
        }

        @Override
        public void run() {
            service.await();
        }
    }
}

class Service{
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();

    public void await(){
        try {

            lock.lock();
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+"线程等待的时间："+System.currentTimeMillis());
            condition.await();
            System.out.println(Thread.currentThread().getName()+"线程唤醒的时间："+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signal(){
        try {

            lock.lock();
            System.out.println(Thread.currentThread().getName()+"线程唤醒其它线程的时间："+System.currentTimeMillis());
            // 该方法和notify()方法一样也是需要执行完该锁内的所有代码才可以进入唤醒线程执行
            condition.signal();
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+"线程唤醒其它线程5秒后的时间："+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
