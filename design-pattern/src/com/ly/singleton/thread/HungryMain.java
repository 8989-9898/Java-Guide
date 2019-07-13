package com.ly.singleton.thread;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.singleton.thread
 * @ClassName: HungryMain
 * @Author: lin
 * @Description: ${description}
 * @Date: ${date} ${time}
 * @Version: 1.0
 */
public class HungryMain {
    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance1 = HungrySingleton.getInstance();
        System.out.println("是否是单列模式："+(instance==instance1));

    }
}
