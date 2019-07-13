package com.ly.bridge.bridge;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.bridge.bridge
 * @ClassName: Main
 * @Author: lin
 * @Description: ${DESCRIPTION}
 * @Date: 2019/7/13 17:59
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        RefinedAbstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();
        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
