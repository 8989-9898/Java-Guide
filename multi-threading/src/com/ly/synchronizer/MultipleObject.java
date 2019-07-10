package com.ly.synchronizer;

/**
 * 多个对象多个对象锁
 */
public class MultipleObject {
    public int number;

    synchronized public void add(int num) {
        number += num;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(""+this.hashCode()+"        =========="+number);
    }
}

class MyThread extends Thread{
    private MultipleObject multipleObject;

    public MyThread(MultipleObject multipleObject) {
        this.multipleObject = multipleObject;
    }

    @Override
    public void run() {
        multipleObject.add(300);
    }

    public static void main(String[] args) {
        // 多个对象获取的是多个对象锁，每个对象锁与对象锁之间都是互不相干的，所以不会有数据叠加
        MultipleObject multipleObject = new MultipleObject();
        MultipleObject multipleObject1 = new MultipleObject();

        MyThread thread = new MyThread(multipleObject);
        MyThread thread1 = new MyThread(multipleObject1);

        thread.start();
        thread1.start();
    }
}