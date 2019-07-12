package com.ly.iterator;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.iterator
 * @ClassName: Aggregate
 * @Author: lin
 * @Description: 聚集抽象类
 * @Date: 2019-07-12 16:54
 * @Version: 1.0
 */
public abstract class Aggregate {
    /**
     * 定义创建迭代器的接口
     * @return
     */
    public abstract Iterator createIterator();
}
