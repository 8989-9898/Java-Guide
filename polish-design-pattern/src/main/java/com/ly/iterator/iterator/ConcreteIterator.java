package com.ly.iterator.iterator;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.iterator.iterator
 * @ClassName: ConcreteIterator
 * @Author: lin
 * @Description: 具体的迭代器实现类，该迭代器迭代的聚合元素是数组，不同的聚合元素的迭代器的实现方式不同
 * @Date: 2019/8/4 16:26
 * @Version: 1.0
 */
public class ConcreteIterator implements Iterator {

    /**
     * 持有被迭代的具体的聚合对象
     */
    private ConcreteAggregate aggregate;
    /**
     * 内部索引，记录当前的迭代位置
     * -1、表示刚开始，从第一个元素开始获取
     */
    private int index = -1;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < this.aggregate.size()) {
            index = index + 1;
        }
    }

    @Override
    public boolean isDone() {
        if (index==this.aggregate.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return this.aggregate.get(index);
    }
}
