package com.ly.decorator.one;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.one
 * @ClassName: main
 * @Author: lin
 * @Description: 装饰模式
 * @Date: 2019-07-08 9:02
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteComponentA componentA = new ConcreteComponentA();
        ConcreteComponentB componentB = new ConcreteComponentB();
        componentA.setComponent(component);
        componentB.setComponent(componentA);
        componentB.operation();
    }
}
