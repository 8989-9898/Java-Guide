package com.ly.iterator.strategy;


import java.util.Iterator;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.iterator.iterator
 * @ClassName: Aggregate
 * @Author: lin
 * @Description: 定义聚合对象的接口,创建相应迭代器的接口
 * @Date: 2019/8/4 16:21
 * @Version: 1.0
 */
public interface Aggregate {

    /**
     * 工厂方法，创建相应的迭代器接口
     * @return
     */
    public Iterator createIterator();
}
