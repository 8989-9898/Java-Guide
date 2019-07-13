package com.ly.singleton.thread;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.singleton.thread
 * @ClassName: Main
 * @Author: lin
 * @Description: 懒汉式的单列模式
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println("是否是单列模式："+(instance==instance1));
    }
}
