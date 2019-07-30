package com.ly.proxy.proxy;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.proxy.proxy
 * @ClassName: Proxy
 * @Author: lin
 * @Description: 代理类，实现与需要代理的对象相同的接口
 * @Date: 2019/7/30 21:48
 * @Version: 1.0
 */
public class Proxy implements Subject{
    /**
     * 持有被代理对象的事例
     */
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    /**
     * 实现相同的方法，在方法内调用真实的方法
     */
    @Override
    public void request() {

        System.out.println("在调用真实方法前的输出");
        // 调用真实的业务对象
        realSubject.request();
        System.out.println("在调用真实方法后的输出");

    }
}
