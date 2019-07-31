package com.ly.proxy.extend;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.proxy.protection
 * @ClassName: Order
 * @Author: lin
 * @Description: 订单对象，只能是创建该订单的人才能修改操作
 * @Date: 2019-07-31 9:23
 * @Version: 1.0
 */
public class Order {
    private String productName;
    private String orderUser;
    private int orderNum;

    public Order() {
    }

    public Order(String productName, String orderUser, int orderNum) {
        this.productName = productName;
        this.orderUser = orderUser;
        this.orderNum = orderNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName,String user) {
        this.productName = productName;
    }

    public String getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(String orderUser,String user) {
        this.orderUser = orderUser;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum,String user) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", orderUser='" + orderUser + '\'' +
                ", orderNum=" + orderNum +
                '}';
    }
}
