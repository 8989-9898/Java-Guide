package com.ly.bridge.bridge;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.bridge.bridge
 * @ClassName: ConcreteImplementorA
 * @Author: lin
 * @Description: 具体的A操作
 * @Date: 2019/7/13 17:54
 * @Version: 1.0
 */
public class ConcreteImplementorA extends Implementor{
    @Override
    public void Operation() {
        System.out.println("执行具体的操作A");
    }
}
