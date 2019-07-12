package com.ly.iterator;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.iterator.before
 * @ClassName: Iterator
 * @Author: lin
 * @Description: 定义迭代器接口
 * @Date: 2019-07-12 16:43
 * @Version: 1.0
 */
public interface Iterator {
    /**
     * 前一个元素
     */
    Object first();

    /**
     * 后一个元素
     */
    Object next();

    /**
     * 是否遍历完成
     */
    boolean isDone();

    /**
     * 获取当前集合对象
     * @return
     */
    Object CurrentItem();
}
