package com.ly.getting_start;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.getting_start
 * @ClassName: ThreadPriority
 * @Author: lin
 * @Description: 测试线程的优先级的继承性
 * @Date: 2019-06-20 16:47
 * @Version: 1.0
 */
public class ThreadPriority implements Runnable{

    @Override
    public void run() {
        System.out.println("my thread priority is "+Thread.currentThread().getPriority());
        ThreadPriority2 priority2 = new ThreadPriority2();
        new Thread(priority2).start();
    }

    public static void main(String[] args) {
        ThreadPriority threadPriority = new ThreadPriority();
        Thread thread = new Thread(threadPriority);
        System.out.println("my thread priority is "+thread.getPriority());
        thread.setPriority(6);
        System.out.println("my thread priority is "+thread.getPriority());
        thread.start();
    }
}

/**
 * 线程的优先级具有继承性，子线程会自动继承父线程的优先级
 */
class ThreadPriority2 implements Runnable{

    @Override
    public void run() {
        System.out.println("my thread priority is "+Thread.currentThread().getPriority());
    }
}