package com.ly.singleton.thread;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.singleton.thread
 * @ClassName: Singleton
 * @Author: lin
 * @Description: 多线程下的单列模式(懒汉式 )
 * @Version: 1.0
 */
public class Singleton {

    private static Singleton singleton;
    /**
     * 用于锁
     */
    private static Object object=new Object();

    private Singleton(){}

    public static Singleton getInstance(){
        if (singleton==null) {
            synchronized (object){
                if (singleton==null) {
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }

}
