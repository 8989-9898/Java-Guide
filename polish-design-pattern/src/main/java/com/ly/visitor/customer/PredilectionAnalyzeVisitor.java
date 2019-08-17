package com.ly.visitor.customer;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.customer
 * @ClassName: PredilectionAnalyzeVisitor
 * @Author: lin
 * @Description: 对客户偏好分析的访问者
 * @Date: 2019/8/17 15:21
 * @Version: 1.0
 */
public class PredilectionAnalyzeVisitor implements Visitor {
    @Override
    public void visitEnterpriseCustomer(EnterPriseCustomer a) {
        System.out.println("根据客户的购买历史记录，对企业客户：" + a.getName() + "进行产品偏好分析！");

    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer b) {
        System.out.println("根据客户的购买历史记录，对个人客户：" + b.getName() + "进行产品偏好分析！");

    }
}
