package com.ly.iterator.page_iterator;

import com.ly.iterator.PayModel;
import com.ly.iterator.pattern.Iterator;
import org.omg.CORBA.ULongLongSeqHelper;

import javax.management.AttributeList;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
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
public class ArrayIteratorImpl implements AggregationIterator {

    private PayModel[] models = null;
    private int index = 0;

    public ArrayIteratorImpl(SalaryManager manager) {
        this.models = manager.getPays();
    }

    @Override
    public boolean hasNext() {
        if (index < this.models.length) {
            return true;
        }
        return false;
    }

    @Override
    public List next(int num) {
        List list = new ArrayList();
        int count = 0;
        while (hasNext() && count < num) {
            list.add(models[index]);
            index = index + 1;
            count = count + 1;
        }
        return list;
    }

    @Override
    public boolean hasPrevious() {
        if (index > 0) {
            return true;
        }
        return false;
    }

    @Override
    public List previous(int num) {
        List list = new ArrayList();
        int count = 0;
        index=index-num;
        while (hasPrevious() && count < num) {
            list.add(models[index]);
            index = index + 1;
            count = count + 1;
        }
        return list;
    }

    @Override
    public List getPage(int pageNum, int pageShow) {
        List list = new ArrayList();
        int start=(pageNum-1)*pageShow;
        int end=start+pageShow-1;
        if (start<0){
            start=0;
        }
        if (end>this.models.length-1) {
            end=this.models.length-1;
        }

        // 每次取值都是从头开始的所以设置index为 0
        index=0;
        while (hasNext() && index <= end) {
            if (index>=start) {
                list.add(models[index]);
            }
            index = index + 1;
        }
        return list;
    }
}
