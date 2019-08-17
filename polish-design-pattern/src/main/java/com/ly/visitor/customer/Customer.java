package com.ly.visitor.customer;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.no.pattern
 * @ClassName: Customer
 * @Author: lin
 * @Description: 各种客户的父类
 * @Date: 2019/8/17 13:47
 * @Version: 1.0
 */
public abstract class Customer {

    /**
     * 客户编号
     */
    private String customerId;

    /**
     * 客户名称
     */
    private String name;


    /**
     * 接受访问者的访问
     * @param visitor 访问者对象
     */
    public abstract void  accept(Visitor visitor);

    public Customer() {
    }

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
