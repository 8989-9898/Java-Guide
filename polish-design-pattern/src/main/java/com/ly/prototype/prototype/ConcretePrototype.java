package com.ly.prototype.prototype;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.prototype
 * @ClassName: ConcretePrototype
 * @Author: lin
 * @Description: 一个具体的克隆对象
 * @Date: 2019/7/28 10:29
 * @Version: 1.0
 */
public class ConcretePrototype implements Prototype{


    @Override
    public Prototype clone() {
        // 由于没有属性直接返回一个新建的对象即可
        ConcretePrototype prototype = new ConcretePrototype();
        return prototype;
    }
}
