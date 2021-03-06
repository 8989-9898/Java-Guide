package com.ly.iterator.no_pattern;

import com.ly.iterator.PayModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.iterator.no_pattern
 * @ClassName: PayManager
 * @Author: lin
 * @Description: 公司已有的工资管理对象，使用的是list集合
 * @Date: 2019/8/4 17:46
 * @Version: 1.0
 */
public class PayManager {

    private List list=new ArrayList();

    public List getPayList(){
        return list;
    }

    /**
     * 计算工资，设置一些初始值
     */
    public void calcPay(){
        list.add(new PayModel("张三",3800,new Date()));
        list.add(new PayModel("李四",2800,new Date()));
        list.add(new PayModel("王五",5000,new Date()));
    }


}
