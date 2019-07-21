package com.ly.singleton.singleton;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.singleton.singleton
 * @ClassName: Client
 * @Author: lin
 * @Description: ${DESCRIPTION}
 * @Date: 2019/7/21 13:36
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton2 singleton2 = Singleton2.newInstance();
        Singleton singleton = Singleton.newInstance();
        singleton2.operation();
        singleton.operation();
    }
}
