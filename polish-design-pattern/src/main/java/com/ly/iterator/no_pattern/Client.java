package com.ly.iterator.no_pattern;

import com.ly.iterator.PayModel;

import java.util.Iterator;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.iterator.no_pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 不使用迭代器模式的事例，由于两个工资的管理对象的存储方式不一样，所以访问的方式也不一样
 * @Date: 2019/8/4 16:44
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {

        // 访问原有公司的工资列表
        System.out.println("原公司的工资单");
        PayManager payManager = new PayManager();
        payManager.calcPay();
        Iterator iterator = payManager.getPayList().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("收购公司的工资单");
        // 访问收购公司的工资列表
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcPay();
        for (PayModel model : salaryManager.getPays()) {
            System.out.println(model);
        }

    }
}
