package com.ly.prototype.prototype;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.prototype
 * @ClassName: Prototype
 * @Author: lin
 * @Description: 定义原型模式的接口，用于克隆自身
 * @Date: 2019/7/28 10:27
 * @Version: 1.0
 */
public interface Prototype {

    /**
     * 克隆自身的方法
     * @return 一个从自身克隆出来的对象
     */
    public Prototype clone();
}
