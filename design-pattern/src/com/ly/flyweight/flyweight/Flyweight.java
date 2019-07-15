package com.ly.flyweight.flyweight;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.flyweight
 * @ClassName: Flyweight
 * @Author: lin
 * @Description: 所有具体享元类的超类或接口，通过这个接口Flyweight可以接受并作用于外部状态
 * @Date: 2019/7/15 20:58
 * @Version: 1.0
 */
public abstract class Flyweight {
    public abstract void operation(int extrinsicstate);
}
