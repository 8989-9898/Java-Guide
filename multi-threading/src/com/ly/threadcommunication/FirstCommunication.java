package com.ly.threadcommunication;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.threadcommunication
 * @ClassName: FirstCommunication
 * @Author: lin
 * @Description: 使用wait和notify实现线程之间的通讯
 * @Date: 2019-06-26 16:31
 * @Version: 1.0
 */
public class FirstCommunication {
    public static void main(String[] args) {
        Object lock = new Object();
        Consumer consumer = new Consumer(lock);
        Production production = new Production(lock);
        new Thread(consumer).start();
        new Thread(production).start();
    }
}

/**
 * 厂库类
 */
class Repository {
    private static List<String> list = new ArrayList<>();

    public static void add(String value) {
        list.add(value);
    }

    public static int size() {
        return list.size();
    }
}


class Consumer implements Runnable {
    private Object lock;

    Consumer(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                if (Repository.size() != 5) {
                    System.out.println("start time :" + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("end time :" + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Production implements Runnable {

    private Object lock;

    Production(Object lock) {
        this.lock = lock;
    }


    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    Repository.add("add " + i);
                    if (i == 5) {
                        lock.notify();// 在通知发出后，不会立即释放锁，需要执行完 synchronized 块中的代码才会释放锁
                        System.out.println("发出通知");
                    }
                    System.out.println("添加第" + i + "个值");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Run {
    public static void main(String[] args) {
        Object lock=new Object();
        Thread thread = new Thread(() -> {
            try {
                synchronized (lock) {
                    System.out.println("start time:" + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("end time:" + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("当前处于等待状态，不能发出线程终止请求，发送错误");
            }
        });

        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }
}