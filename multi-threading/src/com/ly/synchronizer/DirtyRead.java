package com.ly.synchronizer;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.synchronizer
 * @ClassName: DirtyRead
 * @Author: lin
 * @Description: 使用多线程实现脏读
 * @Date: 2019-06-20 17:27
 * @Version: 1.0
 */
public class DirtyRead {
    private String name = "zhangsan";
    private String sex = "女";

    public synchronized void set(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void get() {
        System.out.println("DirtyRead{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}');
    }
}

class MyThread2 extends Thread{

    private DirtyRead dirtyRead;

    public MyThread2(DirtyRead dirtyRead) {
        this.dirtyRead = dirtyRead;
    }

    @Override
    public void run() {
        dirtyRead.set("lisi","男");
    }

    public static void main(String[] args) throws InterruptedException {
        DirtyRead read = new DirtyRead();
        MyThread2 thread2 = new MyThread2(read);
        // 脏读是在两次读取的内容不一致
        read.get();
        thread2.start();
        Thread.sleep(2000);
        read.get();
    }
}
