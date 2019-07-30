package com.ly.proxy.proxy;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.proxy.proxy
 * @ClassName: Client
 * @Author: lin
 * @Description: 代理模式的事例（静态代理）
 * @Date: 2019/7/30 21:45
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
