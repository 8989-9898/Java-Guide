package com.ly.synchronizer;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.synchronizer
 * @ClassName: SynchronizedMethodFault
 * @Author: lin
 * @Description: 同步方法的缺点
 * @Date: 2019-06-25 9:14
 * @Version: 1.0
 */
public class SynchronizedMethodFault {

    public static void main(String[] args) {
        Task task = new Task();
        MyRunable1 runable1 = new MyRunable1(task);
        MyRunable2 runable2 = new MyRunable2(task);

        new Thread(runable1).start();
        new Thread(runable2).start();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long begin = Commons.beginTime1;
        if (Commons.beginTime2 > Commons.beginTime1) {
            begin = Commons.beginTime2;
        }

        long end = Commons.endTime1;
        if (Commons.endTime2 > Commons.endTime1) {
            end = Commons.endTime1;
        }
        System.out.println(Commons.beginTime1);
        System.out.println(Commons.beginTime2);
        System.out.println(Commons.endTime1);
        System.out.println(Commons.endTime2);
        System.out.println(end - begin);
    }
}

/**
 * 任务类,使用同步方法的方式
 */
class Task {
    private String data1;
    private String data2;

    public synchronized void doLongTimeTask() {
        try {
            System.out.println("task start...");
            Thread.sleep(5000);
            data1 = "长时间处理任务后从远程返回的值 1 的线程名是：" + Thread.currentThread().getName();
            data2 = "长时间处理任务后从远程返回的值 2 的线程名是：" + Thread.currentThread().getName();
            System.out.println(data1);
            System.out.println(data2);
            System.out.println("task end...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用同步代码块的方式解决效率问题
     * 使用同步代码块只会同步代码块中的代码进行同步执行，同步代码块外的代码会异步执行
     */
    /*public void doLongTimeTask() {
        try {
            System.out.println("task start...");
            Thread.sleep(5000);
            synchronized (this) {
                data1 = "长时间处理任务后从远程返回的值 1 的线程名是：" + Thread.currentThread().getName();
                data2 = "长时间处理任务后从远程返回的值 2 的线程名是：" + Thread.currentThread().getName();
            }
            System.out.println(data1);
            System.out.println(data2);
            System.out.println("task end...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/
}



/**
 * 时间戳
 */
class Commons {
    public static long beginTime1;
    public static long endTime1;

    public static long beginTime2;
    public static long endTime2;
}


class MyRunable1 implements Runnable {

    private Task task;

    MyRunable1(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        Commons.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        Commons.endTime1 = System.currentTimeMillis();
    }
}

class MyRunable2 implements Runnable {

    private Task task;

    MyRunable2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        Commons.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        Commons.endTime2 = System.currentTimeMillis();
    }
}


