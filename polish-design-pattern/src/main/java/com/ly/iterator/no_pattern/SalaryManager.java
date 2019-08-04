package com.ly.iterator.no_pattern;

import com.ly.iterator.PayModel;

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
public class SalaryManager {

    private PayModel[] pms=null;

    public PayModel[] getPays(){
        return pms;
    }

    public void calcPay(){
        pms=new PayModel[3];
        pms[0]=new PayModel("赵六",4000,new Date());
        pms[1]=new PayModel("田七",2500,new Date());
        pms[2]=new PayModel("王二麻子",3100,new Date());
    }

}
