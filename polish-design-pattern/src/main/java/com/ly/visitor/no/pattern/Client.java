package com.ly.visitor.no.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.no.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 不使用模式的客户分析
 *              如果需要添加对每个客户的新的分析功能，就需要修改每个客户的实现
 *              如添加客户对公司产品的偏好分析和客户的价值分析
 *              同时将对客户分析的功能全部读集中在同一个类中，而且相同的功能分散到不同的类中实现。
 * @Date: 2019/8/17 14:31
 * @Version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        for (Customer customer : preparedTestData()) {
            // 循环对客户进行操作

            customer.serviceRequest();
            // 进行偏好分析
            customer.predilectionAnalyze();
            // 进行客户价值分析
            customer.worthAnalyze();
        }
    }

    private static List<Customer> preparedTestData(){
        List<Customer> list = new ArrayList<>(5);

        Customer A = new EnterPriseCustomer();
        A.setName("A企业");
        list.add(A);

        Customer B = new EnterPriseCustomer();
        B.setName("B企业");
        list.add(B);

        Customer person = new PersonalCustomer();
        person.setName("个人客户");
        list.add(person);
        return list;
    }
}
