package com.ly.myvolatile;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.myvolatile
 * @ClassName: FirstVolatile
 * @Author: lin
 * @Description: 使用volatile关键字
 * @Date: 2019-06-25 17:35
 * @Version: 1.0
 */
public class FirstVolatile {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        new Thread(thread).start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.setRunning(false);

        System.out.println("进入了死循环。。。");
    }
}

class MyThread implements Runnable {

    public void setRunning(boolean running) {
        this.running = running;
    }

    // 在线程的情况下，每次读取的都是本地的缓存，没有去读取主存的数据
    private boolean running = true;
    int number = 0;

    @Override
    public void run() {
        System.out.println("进入running...");
        while (running) {
            int a = 1;
            int b = 2;
            number = a + b;
            // 以下语句二选一，都可以退出循环。因为这根CPU的时间有关，JVM会尽力去保证变量值的更新，但是在循环时没有进行其它的事情，
            // CPU没有时间去处理其它的事情导致造成死循环，而在加上输出或者sleep时，给CPU空出来时间可以去保证变量值的更新可以退出循环
            /*System.out.println("在这里加上输出语句的时候，在修改循环条件后会退出循环");
            try {
                // 在这里加上 sleep 也会导致退出循环
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        System.out.println(number);
        System.out.println("结束了");
    }
}


class Run{
    public static void main(String[] args) {
        MyThread2 thread = new MyThread2();
        new Thread(thread).start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.setRunning(false);
    }
}

class MyThread2 implements Runnable {

    public void setRunning(boolean running) {
        this.running = running;
    }

    // 使用volatile强制进行主存的读写，每次读写都会进入主存中进行操作
    private volatile boolean running = true;
    int number = 0;

    @Override
    public void run() {
        System.out.println("进入running...");
        while (running) {
            int a = 1;
            int b = 2;
            number = a + b;
        }
        System.out.println(number);
        System.out.println("结束了");
    }
}
