package com.ly.myvolatile;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.myvolatile
 * @ClassName: AtomicityVolatile
 * @Author: lin
 * @Description: volatile的原子性
 * @synchronized和volatile的比较  volatile线程同步的轻量级锁，所以volatile比synchronized的性能要好
 *                                ，但是volatile只能修饰变量。
 *                                synchronized在jdk1.6之后主要包括为了减少获得锁和释放锁带来饿性能消耗
 *                                而引入的偏向锁和轻量级锁以及其它的各种优化之后执行效率有了显著的提升，
 *                                在实际的开发中，使用synchronized的更多。
 *                                多线程访问 volatile关键字不会发生阻塞，synchronized会阻塞
 *                                volatile能保证数据的可见性，不能保证数据的原子性，synchronized两者都保证
 *                                volatile解决变量在多线程中的可见性，synchronized保证多个线程之间访问资源的同步性
 * @Date: 2019-06-26 8:48
 * @Version: 1.0
 */
public class AtomicityVolatile {
    public static void main(String[] args) {
        Atomicity[] atomicities = new Atomicity[100];
        Thread[] threads=new Thread[100];
        for (int i=0;i<100;i++){
            atomicities[i]=new Atomicity();
            threads[i]=new Thread(atomicities[i]);
        }
        for (int i = 0; i < 100; i++) {
            threads[i].start();
        }
    }
}

class Atomicity implements Runnable {
    // volatile 变量保证不了原子性的(自增操作)，
    volatile public static int number;
    // 如果要保证变量的原子性，只需要添加 synchronized 修饰就可以了
    public void addNumber() {
        for (int i = 0; i < 100; i++) {
            number = i;
        }
        System.out.println(number);
    }

    @Override
    public void run() {
        addNumber();
    }
}
