package com.ly.singleton.no_pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.singleton
 * @ClassName: Client
 * @Author: lin
 * @Description: 在不适用模式时，每次创建一个 配置对象就需要从新new一个，同时会去去读文件进行配置，消耗内存
 * @Date: 2019/7/21 11:59
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        AppConfig appConfig1 = new AppConfig();
        System.out.println(appConfig1);
        AppConfig appConfig2 = new AppConfig();
        System.out.println(appConfig2);
        AppConfig appConfig3 = new AppConfig();
        System.out.println(appConfig3);
        System.out.println(appConfig1 == appConfig2);
        System.out.println(appConfig1 == appConfig3);
    }
}
