package com.ly.getting_start;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.getting_start
 * @ClassName: ThreadStop
 * @Author: lin
 * @Description: 线程停止
 * @Date: 2019-06-20 16:38
 * @Version: 1.0
 */
public class ThreadStop implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <500000 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadStop stop = new ThreadStop();
        Thread thread = new Thread(stop);
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();// 该方法停止的是该线程之后要执行的方法，正在执行的方法是不会停止的
    }
}
class ThreadStop2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <500000 ; i++) {
            if (Thread.currentThread().isInterrupted()){
                System.out.println("线程停止了，退出");
                break;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadStop2 stop = new ThreadStop2();
        Thread thread = new Thread(stop);
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();// 该方法停止的是该线程之后要执行的方法，正在执行的方法是不会停止的
    }
}

