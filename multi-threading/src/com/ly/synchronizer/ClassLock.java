package com.ly.synchronizer;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.synchronizer
 * @ClassName: ClassLock
 * @Author: lin
 * @Description: 使用同步静态方法和同步代码块的进行类锁测试
 * @Date: 2019-06-25 10:32
 * @Version: 1.0
 */
public class ClassLock {
    public static void main(String[] args) {
        Service service = new Service();
        Thread threadA = new Thread(() -> {
            service.pringA();
        });
        Thread threadB = new Thread(() -> {
            service.pringB();
        });
        Thread threadC = new Thread(() -> {
            service.pringC();
        });
        threadA.setName("A");
        threadB.setName("B");
        threadC.setName("C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}

class Service {
    public void pringA() {
        // 使用代码块进行类锁
        synchronized (Service.class) {
            System.out.println("获取锁的时间：" + System.currentTimeMillis() + "\t 线程是：" + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("释放锁的时间：" + System.currentTimeMillis() + "\t 线程是：" + Thread.currentThread().getName());
        }
    }

    /**
     * 静态方法进行的是类级别的锁
     */
    public static synchronized void pringB() {
        // 使用代码块进行类锁
        System.out.println("获取锁的时间：" + System.currentTimeMillis() + "\t 线程是：" + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("释放锁的时间：" + System.currentTimeMillis() + "\t 线程是：" + Thread.currentThread().getName());
    }

    /**
     * 非静态方法进行的是对象锁,不会和类锁进行资源抢占
     */
    public synchronized void pringC() {
        // 使用代码块进行类锁
        System.out.println("获取锁的时间：" + System.currentTimeMillis() + "\t 线程是：" + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("释放锁的时间：" + System.currentTimeMillis() + "\t 线程是：" + Thread.currentThread().getName());
    }
}