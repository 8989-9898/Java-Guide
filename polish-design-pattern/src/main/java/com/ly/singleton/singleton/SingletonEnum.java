package com.ly.singleton.singleton;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.singleton.singleton
 * @ClassName: SingletonEnum
 * @Author: lin
 * @Description: 使用枚举实现单例
 *               使用枚举实现单例控制会更加的简洁，而且无偿的提供了序列化的功能，并由jvm从根本上提供
 *               保障，绝对防止多次实例化，是更加简洁、高效、安全的实现单例的方法
 * @Date: 2019/7/21 14:59
 * @Version: 1.0
 */
public enum SingletonEnum {
    uniqueSingleton;

    public void println(){
        System.out.println("该单例特有的方法");
    }
}

class Main{
    public static void main(String[] args) {
        SingletonEnum.uniqueSingleton.println();
    }
}