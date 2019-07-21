package com.ly.singleton.singleton;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.singleton.singleton
 * @ClassName: Singleton2
 * @Author: lin
 * @Description: 单例模式（饿汉式）
 * @Date: 2019/7/21 13:34
 * @Version: 1.0
 */
public class Singleton2 {

    private static Singleton2 singleton2 =new Singleton2();

    private Singleton2(){}

    public static Singleton2 newInstance(){
        return singleton2;
    }

    /**
     * 该单例的属性
     */
    private String data;

    /**
     * 该单例的行为
     */
    public void operation() {
        System.out.println("饿汉式的行为");
    }
}
