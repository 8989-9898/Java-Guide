package com.ly.getting_start;

import javax.xml.ws.soap.MTOM;
import java.util.concurrent.*;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.getting_start
 * @ClassName: CreateThread
 * @Author: lin
 * @Description: 创建线程的四种方式
 * @Date: 2019-06-20 15:50
 * @Version: 1.0
 */
public class CreateThread {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

/**
 * 使用继承 Thread的方式创建线程
 */
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("my thread start....");
    }
}

/**
 * 使用实现 Runnable 接口的方式创建线程
 */
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("my runnable....");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();
    }
}

/**
 * 使用 Callable 接口创建返回结果的线程
 */
class MyCallable implements Callable<String>{
    @Override
    public String call() throws Exception {
        return "my callable start...";
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        // 用于接收返回结果
        FutureTask<String> result=new FutureTask<>(myCallable);
        new Thread(result).start();
        System.out.println(result.get());
    }
}

/**
 * 使用线程池创建线程（推荐）
 */
class MyExecutor{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建简单的线程池（实际上自有一个线程）
        ExecutorService service = Executors.newSingleThreadExecutor();
        // 执行没有返回值的线程
        service.execute(()->System.out.println("my executor start..."));

        Future<String> future = service.submit(() ->  "my executor start return.....");
        System.out.println(future.get());
        service.shutdown();
    }
}