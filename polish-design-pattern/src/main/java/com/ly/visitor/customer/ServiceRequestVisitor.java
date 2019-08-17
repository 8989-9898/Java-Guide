package com.ly.visitor.customer;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.customer
 * @ClassName: ServiceRequestVisitor
 * @Author: lin
 * @Description: 提出客户服务的访问者
 * @Date: 2019/8/17 15:19
 * @Version: 1.0
 */
public class ServiceRequestVisitor implements Visitor {
    @Override
    public void visitEnterpriseCustomer(EnterPriseCustomer a) {
        //企业客户提出服务请求的方法

        // 提出的具体的请求
        System.out.println(a.getName() + "企业提出的服务请求！");

    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer b) {
        System.out.println(b.getName() + "个人客户提出的服务请求");
    }
}
