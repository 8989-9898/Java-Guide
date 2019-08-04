package com.ly.iterator.java_pattern;

import java.util.Iterator;

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
    private int index = 0;

    public ArrayIteratorImpl(SalaryManager manager) {
        this.manager = manager;
    }

    @Override
    public boolean hasNext() {
        if (index < this.manager.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Object object=null;
        if (hasNext()) {
            object=manager.get(index);
            index = index + 1;
        }
        return object;
    }

    @Override
    public void remove() {

    }

}
