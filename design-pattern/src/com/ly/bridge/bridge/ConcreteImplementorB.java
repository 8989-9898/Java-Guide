package com.ly.bridge.bridge;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.bridge.bridge
 * @ClassName: ConcreteImplementorB
 * @Author: lin
 * @Description: 操作B
 * @Date: 2019/7/13 17:55
 * @Version: 1.0
 */
public class ConcreteImplementorB extends Implementor {
    @Override
    public void Operation() {
        System.out.println("执行具体的操作B");
    }
}
