package com.ly.iterator.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.iterator.pattern
 * @ClassName: ListIteratorImpl
 * @Author: lin
 * @Description: 迭代列表的迭代对象
 * @Date: 2019/8/4 18:07
 * @Version: 1.0
 */
public class ListIteratorImpl implements Iterator {

    private PayManager manager;
    private int index = -1;

    public ListIteratorImpl(PayManager manager) {
        this.manager = manager;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if(index<this.manager.size()){
            index=index+1;
        }
    }

    @Override
    public boolean isDone() {
        if (index==this.manager.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return this.manager.get(index);
    }
}
