package com.ly.visitor.no.pattern;

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
     * 客户提出服务请求的方法，示意一下
     */
    public abstract void serviceRequest();

    /**
     * 新添加的客户对公司产品的偏好分析
     */
    public abstract void predilectionAnalyze();

    /**
     * 新添加的客户价值分析
     */
    public abstract void worthAnalyze();

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
