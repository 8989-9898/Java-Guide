package com.ly.visitor.customer;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.customer
 * @ClassName: WorthAnalyzeVisitor
 * @Author: lin
 * @Description: 对可客户价值分析的访问者。后加入的功能与原有的功能无任何关系
 * @Date: 2019/8/17 15:23
 * @Version: 1.0
 */
public class WorthAnalyzeVisitor implements Visitor {
    @Override
    public void visitEnterpriseCustomer(EnterPriseCustomer a) {
        System.out.println("根据客户的购买金额和数量，对企业客户：" + a.getName() + " 进行价值分析");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer b) {
        System.out.println("根据客户的购买金额和数量，对个人客户：" + b.getName() + " 进行价值分析");

    }
}
