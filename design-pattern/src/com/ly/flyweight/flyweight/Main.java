package com.ly.flyweight.flyweight;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.flyweight
 * @ClassName: Main
 * @Author: lin
 * @Description: ${DESCRIPTION}
 * @Date: 2019/7/15 21:12
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        int extrinsicstate = 20;

        FlyweightFactory factory = new FlyweightFactory();
        Flyweight c = factory.getFlyweight("C");
        c.operation(--extrinsicstate);
        Flyweight a = factory.getFlyweight("A");
        a.operation(--extrinsicstate);
        Flyweight d = factory.getFlyweight("D");
        d.operation(--extrinsicstate);
        Flyweight b = factory.getFlyweight("B");
        b.operation(--extrinsicstate);

        UnsharedConcreteFlyweight flyweight = new UnsharedConcreteFlyweight();
        flyweight.operation(--extrinsicstate);
    }
}
