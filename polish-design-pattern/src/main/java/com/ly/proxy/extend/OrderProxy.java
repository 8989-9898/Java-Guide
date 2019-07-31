package com.ly.proxy.extend;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.proxy.protection
 * @ClassName: OrderProxy
 * @Author: lin
 * @Description: 订单的代理对象
 * @Date: 2019-07-31 9:26
 * @Version: 1.0
 */
public class OrderProxy extends Order {
    public OrderProxy(String productName, String orderUser, int orderNum) {
        super(productName, orderUser, orderNum);
    }

    @Override
    public void setProductName(String productName, String user) {
        if (null != user && super.getOrderUser().equals(user)) {
            super.setProductName(productName, user);
        } else {
            System.out.println(user + "，你没有权限操作该订单");
        }
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        if (null != user && super.getOrderUser().equals(user)) {
            super.setOrderUser(orderUser, user);
        } else {
            System.out.println(user + "，你没有权限操作该订单");
        }
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        if (null != user && super.getOrderUser().equals(user)) {
            super.setOrderNum(orderNum, user);
        } else {
            System.out.println(user + "，你没有权限操作该订单");
        }
    }
}
