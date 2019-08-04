package com.ly.iterator.pattern;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.iterator.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用迭代器模式的公司工资列表信息
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
        System.out.println("收购公司的工资单");
        // 访问收购公司的工资列表
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcPay();
        printWorkList(salaryManager.createIterator());
    }

    private static void printWorkList(Iterator iterator){
        iterator.first();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
