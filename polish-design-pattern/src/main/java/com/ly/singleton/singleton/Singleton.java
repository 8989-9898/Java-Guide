package com.ly.singleton.singleton;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.singleton.singleton
 * @ClassName: Singleton
 * @Author: lin
 * @Description: 单例模式（懒汉式单例）
 * @Date: 2019/7/21 12:52
 * @Version: 1.0
 */
public class Singleton {

    /**
     * 定义一个静态的类变量
     */
    private static Singleton uniqueSingleton = null;

    /**
     * 私有化构造方法
     */
    private Singleton() {
    }

    /**
     * 定义一个静态方法为客户端提供类实例
     *
     * @return
     */
    public static synchronized Singleton newInstance() {
        if (uniqueSingleton == null) {
            uniqueSingleton = new Singleton();
        }
        return uniqueSingleton;
    }

    /**
     * 该单例的属性
     */
    private String data;

    /**
     * 该单例的行为
     */
    public void operation() {
        System.out.println("懒汉式的行为");
    }
}
