package com.ly.flyweight.flyweight;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.flyweight
 * @ClassName: UnsharedConcreteFlyweight
 * @Author: lin
 * @Description: 不享元的 Flyweight 子类
 * @Date: 2019/7/15 21:04
 * @Version: 1.0
 */
public class UnsharedConcreteFlyweight extends Flyweight {


    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体 Flyweight："+extrinsicstate);
    }
}
