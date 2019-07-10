package com.ly.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.lock
 * @ClassName: FairOrNofairLock
 * @Author: lin
 * @Description: 公平锁和非公平锁
 * @Date: 2019-06-27 11:10
 * @Version: 1.0
 */
public class FairOrNofairLock {

    public static void main(String[] args) {
        //true为公平锁，false为非公平锁
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("★线程" + Thread.currentThread().getName()
                        + "运行了");
                service.serviceMethod();
            }
        };

        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }


    static public class Service {
        private ReentrantLock lock;

        public Service(boolean isFair) {
            super();
            lock = new ReentrantLock(isFair);
        }

        public void serviceMethod() {
            lock.lock();
            try {
                System.out.println("ThreadName=" + Thread.currentThread().getName()
                        + "获得锁定");
            } finally {
                lock.unlock();
            }
        }
    }
}
