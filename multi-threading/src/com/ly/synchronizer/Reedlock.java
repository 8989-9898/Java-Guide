package com.ly.synchronizer;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.synchronizer
 * @ClassName: Reedlock
 * @Author: lin
 * @Description: 测试 synchronized 的重入性
 * @Date: 2019-06-20 17:36
 * @Version: 1.0
 */
public class Reedlock {

    public synchronized void get1(){
        System.out.println("get1...");
        get2();
    }
    public synchronized void get2(){
        System.out.println("get2...");
        get3();
    }
    public synchronized void get3(){
        System.out.println("get3...");
        get4();
    }
    public synchronized void get4(){
        System.out.println("get4...");
    }

    public static void main(String[] args) {
        // synchronized 实现的锁有可重入性，不会造成死锁
        Reedlock reedlock = new Reedlock();
        new Thread(()->reedlock.get1()).start();
    }
}
