package com.ly.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.lock
 * @ClassName: MyReadWriteLock
 * @Author: lin
 * @Description: 读写锁的测试
 * @Date: 2019-06-27 13:21
 * @Version: 1.0
 */
public class MyReadWriteLock {
    public static void main(String[] args) {

        ReadWriteService service=new ReadWriteService();
        // 读锁共享
        new Thread(()->{
           service.read();
        }).start();
        new Thread(()->{
            service.read();
        }).start();
        new Thread(()->{
            service.read();
        }).start();
    }

    public static class ReadTest{
        public static void main(String[] args) {
            ReadWriteService service=new ReadWriteService();
            // 写锁互斥
            new Thread(()->{
                service.write();
            }).start();
            new Thread(()->{
                service.write();
            }).start();
            new Thread(()->{
                service.write();
            }).start();
        }
    }

    public static class ReadWriteTest{
        public static void main(String[] args) {
            ReadWriteService service=new ReadWriteService();
            // 读写|写读互斥
            new Thread(()->{
                service.read();
            }).start();
            new Thread(()->{
                service.write();
            }).start();
            new Thread(()->{
                service.read();
            }).start();
        }
    }
}

/**
 * 读写类
 */
class ReadWriteService{
    // 默认为非公平锁，false非公平锁，true公平锁
    private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();

    public void read(){
        try {
            lock.readLock().lock();
            System.out.println(Thread.currentThread().getName()+"---获得读锁");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+"---释放读锁");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.readLock().unlock();
        }
    }

    public void write(){
        try {
            lock.writeLock().lock();
            System.out.println(Thread.currentThread().getName()+"---获得写锁");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+"---释放写锁");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.writeLock().unlock();
        }
    }
}
