package com.ly.singleton.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.singleton.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description:
 * @Date: 2019/7/21 13:41
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        System.out.println(config);
    }
}
