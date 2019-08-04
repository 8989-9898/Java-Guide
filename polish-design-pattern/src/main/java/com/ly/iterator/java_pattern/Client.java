package com.ly.iterator.java_pattern;

import java.util.Iterator;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.iterator.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用java自带的迭代器模式的公司工资列表信息
 * @Date: 2019/8/4 18:02
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 访问原有公司的工资列表
        System.out.println("原公司的工资单");
        PayManager payManager = new PayManager();
        payManager.calcPay();
        printWorkList(payManager.createIterator());
        // 访问收购公司的工资列表
        SalaryManager salaryManager = new SalaryManager();
        System.out.println("收购公司的工资单");
        salaryManager.calcPay();
        printWorkList(salaryManager.createIterator());
    }

    private static void printWorkList(Iterator iterator){

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
