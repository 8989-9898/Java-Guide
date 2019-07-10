package com.ly.synchronizer;

import sun.security.provider.Sun;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.synchronizer
 * @ClassName: SynchronizedCodeBlock
 * @Author: lin
 * @Description: 使用同步代码块
 * @Date: 2019-06-25 10:13
 * @Version: 1.0
 */
public class SynchronizedCodeBlock {

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        MyObject object = new MyObject();
        MyObject object1=new MyObject();
        // 同一个对象锁，进行的是同步操作,不同的对象锁进行的是异步操作
        ThreadA threadA = new ThreadA(task3, object);
        // ThreadB threadB = new ThreadB(task3, object);
        ThreadB threadB = new ThreadB(task3, object1);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }

}

/**
 * 用于做同步的对象的对象监视器
 */
class MyObject {
}

class Task3 {
    public void testMethod(MyObject object) {
        // 使用对象作为代码块的锁
        synchronized (object) {
            System.out.println("获取锁的时间："+System.currentTimeMillis()+"\t 线程是："+Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("释放锁的时间："+System.currentTimeMillis()+"\t 线程是："+Thread.currentThread().getName());
        }
    }
}

class ThreadA extends Thread{
    private Task3 task3;
    private MyObject object;

    ThreadA(Task3 task3, MyObject object) {
        this.task3 = task3;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        task3.testMethod(object);
    }
}
class ThreadB extends Thread{
    private Task3 task3;
    private MyObject object;

    ThreadB(Task3 task3, MyObject object) {
        this.task3 = task3;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        task3.testMethod(object);
    }
}
