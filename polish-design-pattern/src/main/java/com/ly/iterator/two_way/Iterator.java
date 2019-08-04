package com.ly.iterator.two_way;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.iterator.iterator
 * @ClassName: Iterator
 * @Author: lin
 * @Description: 定义迭代器接口，定义访问元素和遍历元素的操作
 * @Date: 2019/8/4 16:20
 * @Version: 1.0
 */
public interface Iterator {
    /**
     * 聚合元素的第一个元素
     */
    public void first();

    /**
     * 下移一个元素
     */
    public void next();

    /**
     * 是否已经移动到最后一个元素，true 表示已经是最后一个  ，false 表示不是最后一个
     * @return
     */
    public boolean isDone();

    /**
     * 获取当前的当前元素
     * @return
     */
    public Object currentItem();

    /**
     * 是否是第一个元素
     * @return
     */
    public boolean isFirst();

    /**
     * 移动到上一个聚合元素
     */
    public void previous();
}
