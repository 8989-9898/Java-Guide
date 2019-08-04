package com.ly.iterator.two_way;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.iterator.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用双向迭代器模式的公司工资列表信息
 * @Date: 2019/8/4 18:02
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("收购公司的工资单");
        // 访问收购公司的工资列表
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcPay();
        Iterator iterator = salaryManager.createIterator();
        iterator.first();
        if (!iterator.isDone()) {
            System.out.println("next1==》"+iterator.currentItem());
            iterator.next();
        }
        if (!iterator.isFirst()) {
            iterator.previous();
            System.out.println("previous1==》"+iterator.currentItem());
        }
        if (!iterator.isDone()) {
            System.out.println("next2==》"+iterator.currentItem());
            iterator.next();
        }
        if (!iterator.isDone()) {
            System.out.println("next3==》"+iterator.currentItem());
            iterator.next();
        }
        if (!iterator.isFirst()) {
            iterator.previous();
            System.out.println("previous2==》"+iterator.currentItem());
        }
    }
}
