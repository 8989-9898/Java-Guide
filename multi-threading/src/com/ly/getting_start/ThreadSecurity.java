package com.ly.getting_start;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.getting_start
 * @ClassName: ThreadSecurity
 * @Author: lin
 * @Description: 测试线程的数据安全
 * @Date: 2019-06-20 16:26
 * @Version: 1.0
 */
public class ThreadSecurity implements Runnable{
    int number=5;

    public static void main(String[] args) {
        // 多个线程之间数据是不共享的，每个线程操作的都是各自的数据，所有是线程安全的
        ThreadSecurity security1 = new ThreadSecurity();
        ThreadSecurity security2 = new ThreadSecurity();
        ThreadSecurity security3 = new ThreadSecurity();
        ThreadSecurity security4 = new ThreadSecurity();
        new Thread(security1,"a").start();
        new Thread(security2,"b").start();
        new Thread(security3,"c").start();
        new Thread(security4,"d").start();
    }

    @Override
    public void run() {
        while (number > 0) {
            number--;
            System.out.println(Thread.currentThread().getName()+":"+number);
        }
    }
}

/**
 * 多个线程之间数据是共享的，度可以操作数据造成了数据不安全
 */
class ShareVariableThread implements Runnable{
    public int number=5;

    @Override
    public void run() {
        while (number > 0) {
            number--;
            System.out.println(Thread.currentThread().getName()+":"+number);
        }
    }

    public static void main(String[] args) {
        ShareVariableThread security4 = new ShareVariableThread();
        new Thread(security4,"a").start();
        new Thread(security4,"b").start();
        new Thread(security4,"c").start();
        new Thread(security4,"d").start();
    }
}