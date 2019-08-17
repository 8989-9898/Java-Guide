package com.ly.visitor.customer;



/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.pattern
 * @ClassName: Visitor
 * @Author: lin
 * @Description: 访问者的接口，为所有的访问者对象申明一个visit方法
 * @Date: 2019/8/17 14:48
 * @Version: 1.0
 */
public interface Visitor {

    /**
     * 访问企业用户，相当于给企业用户添加访问者的功能
     * @param a 元素 B 的对象
     */
    public void visitEnterpriseCustomer(EnterPriseCustomer a);

    /**
     * 访问个人客户，相当于给个人客户添加访问者的功能
     * @param b 元素 B 的对象
     */
    public void visitPersonalCustomer(PersonalCustomer b);



}
