package com.ly.iterator.two_way;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.iterator.pattern
 * @ClassName: ArrayIteratorImpl
 * @Author: lin
 * @Description: 迭代数组的迭代对象
 * @Date: 2019/8/4 18:06
 * @Version: 1.0
 */
public class ArrayIteratorImpl implements Iterator {

    private SalaryManager manager;
    private int index = -1;

    public ArrayIteratorImpl(SalaryManager manager) {
        this.manager = manager;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < this.manager.size()) {
            index = index + 1;
        }
    }

    @Override
    public boolean isDone() {
        if (index == this.manager.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return manager.get(index);
    }

    @Override
    public boolean isFirst() {
        if (index==0) {
            return true;
        }
        return false;
    }

    @Override
    public void previous() {
        if (index>0) {
            index=index-1;
        }
    }
}
