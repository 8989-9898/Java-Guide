package com.ly.iterator.strategy;

import com.ly.iterator.PayModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    private int index = 0;
    private PayModel[] models=null;

    public ArrayIteratorImpl(SalaryManager manager) {
        // 筛选出工资在3000 以下的员工
        List<PayModel> list = new ArrayList<>();
        for (PayModel model : manager.getPays()) {
            if (model.getPay()<3000) {
                list.add(model);
            }
        }
        models=new PayModel[list.size()];
        for (int i = 0; i < list.size(); i++) {
            models[i]=list.get(i);
        }
    }

    @Override
    public boolean hasNext() {
        if (index < models.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Object object=null;
        if (hasNext()) {
            object=models[index];
            index = index + 1;
        }

        return object;
    }

    @Override
    public void remove() {

    }

}
