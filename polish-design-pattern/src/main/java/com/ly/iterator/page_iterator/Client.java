package com.ly.iterator.page_iterator;



import java.sql.SQLSyntaxErrorException;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.iterator.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用迭代器模式已翻页的方式显示公司工资列表信息
 * @Date: 2019/8/4 18:02
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("收购公司的工资单");
        // 访问收购公司的工资列表
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcPay();
        AggregationIterator iterator = salaryManager.createIterator();
        System.out.println("第一页数据");
        printWorkList(iterator.next(2));

        System.out.println("第二页数据");
        printWorkList(iterator.next(2));

        System.out.println("第二页数据");
        printWorkList(iterator.previous(2));


        System.out.println("第二页数据（随机）");
        printWorkList(iterator.getPage(2,3));

        System.out.println("第一页数据（随机）");
        printWorkList(iterator.getPage(1,3));



    }

    private static void printWorkList(List list){
        java.util.Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
