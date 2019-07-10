package com.ly.lock;


import java.util.concurrent.locks.ReentrantLock;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.lock
 * @ClassName: ReentrantLockTest
 * @Author: lin
 * @Description: 测试可重入锁
 * @Date: 2019-06-27 9:58
 * @Version: 1.0
 */
public class ReentrantLockTest {
    public static void main(String[] args) {
        Service service = new Service();
        Client client1 = new Client(service);
        Client client2 = new Client(service);
        Client client3 = new Client(service);
        client1.start();
        client2.start();
        client3.start();
    }

    public static class Service {
        private ReentrantLock lock = new ReentrantLock();

        public void Test() {
            try {
                for (int i = 0; i < 5; i++) {
                    lock.lock();
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + "========" + lock.getHoldCount());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 重入五次就要释放五次锁
                int count = lock.getHoldCount();
                for (int i = 0; i < count; i++) {
                    lock.unlock();
                    System.out.println(Thread.currentThread().getName() + "========" + lock.getHoldCount());
                }
            }
        }
    }

    public static class Client extends Thread {
        private Service service;

        public Client(Service service) {
            this.service = service;
        }

        @Override
        public void run() {
            service.Test();
        }
    }
}
