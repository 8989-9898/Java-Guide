package com.ly.iterator.page_iterator;

import com.ly.iterator.PayModel;
import com.ly.iterator.pattern.Iterator;

import java.util.Date;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.iterator.no_pattern
 * @ClassName: SalaryManager
 * @Author: lin
 * @Description: 被收购公司的工资管理对象，使用 数组 管理
 * @Date: 2019/8/4 17:52
 * @Version: 1.0
 */
public class SalaryManager implements Aggregate{

    private PayModel[] pms=null;

    public PayModel[] getPays(){
        return pms;
    }

    public int size(){
        return pms.length;
    }

    public PayModel get(int index){
        PayModel model=null;
        if (index<pms.length){
            model=pms[index];
        }
        return model;
    }


    public void calcPay(){
        pms=new PayModel[6];
        pms[0]=new PayModel("赵六",4000,new Date());
        pms[1]=new PayModel("田七",2500,new Date());
        pms[2]=new PayModel("王二麻子",3100,new Date());
        pms[3]=new PayModel("张三",3800,new Date());
        pms[4]=new PayModel("李四",2800,new Date());
        pms[5]=new PayModel("王五",5000,new Date());
    }

    @Override
    public AggregationIterator createIterator() {
        return new ArrayIteratorImpl(this);
    }
}
