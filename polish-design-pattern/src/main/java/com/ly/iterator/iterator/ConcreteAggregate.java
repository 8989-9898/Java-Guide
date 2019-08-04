package com.ly.iterator.iterator;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.iterator.iterator
 * @ClassName: ConcreteAggregate
 * @Author: lin
 * @Description: 具体的某种类型的迭代器对象,该剧和类型为数组
 * @Date: 2019/8/4 16:29
 * @Version: 1.0
 */
public class ConcreteAggregate implements Aggregate {

    private String[] array = null;

    public ConcreteAggregate(String[] array) {
        this.array = array;
    }


    @Override
    public Iterator createIterator() {
        // 创建迭代器的工厂方法
        return new ConcreteIterator(this);
    }

    /**
     * 获取指定索引的元素
     * @param index
     * @return
     */
    public Object get(int index) {
        Object object = null;
        if (index < this.array.length) {
            object = this.array[index];
        }
        return object;
    }

    /**
     * 获取聚合元素的大小
     * @return
     */
    public int size() {
        return this.array.length;
    }
}
