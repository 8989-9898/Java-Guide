package com.ly.singleton;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.singleton
 * @ClassName: Singleton
 * @Author: lin
 * @Description: 单列模式类，只生成一个对象
 * @Version: 1.0
 */
public class Singleton {
    private static Singleton singleton;
    private Singleton(){}

    public static Singleton getInstance(){
        if (singleton==null) {
            singleton=new Singleton();
        }
        return singleton;
    }
}
