package com.ly.singleton.thread;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.singleton.thread
 * @ClassName: HungrySingleton
 * @Author: lin
 * @Description: 饿汉式
 * @Version: 1.0
 */
public class HungrySingleton {
    private static HungrySingleton instance=new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return instance;
    }
}
