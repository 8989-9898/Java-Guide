package com.ly.proxy.proxy;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.proxy.proxy
 * @ClassName: RealSubject
 * @Author: lin
 * @Description: 一个真正的接口实现
 * @Date: 2019/7/30 21:47
 * @Version: 1.0
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("真实实现的类方法^_^");
    }
}
