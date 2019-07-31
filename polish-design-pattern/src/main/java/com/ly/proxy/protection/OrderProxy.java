package com.ly.proxy.protection;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.proxy.protection
 * @ClassName: OrderProxy
 * @Author: lin
 * @Description: 订单的代理对象
 * @Date: 2019-07-31 9:26
 * @Version: 1.0
 */
public class OrderProxy implements OrderApi {

    private Order order;

    public OrderProxy(Order order) {
        this.order = order;
    }

    @Override
    public String getProductName() {
        return order.getProductName();
    }

    @Override
    public void setProductName(String productName, String user) {
        if (null != user && order.getOrderUser().equals(user)) {
            order.setProductName(productName, user);
        } else {
            System.out.println(user + "，你没有权限操作该订单");
        }
    }

    @Override
    public String getOrderUser() {
        return order.getOrderUser();
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        if (null != user && order.getOrderUser().equals(user)) {
            order.setOrderUser(orderUser, user);
        } else {
            System.out.println(user + "，你没有权限操作该订单");
        }
    }

    @Override
    public int getOrderNum() {
        return order.getOrderNum();
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        if (null != user && order.getOrderUser().equals(user)) {
            order.setOrderNum(orderNum, user);
        } else {
            System.out.println(user + "，你没有权限操作该订单");
        }
    }


    @Override
    public String toString() {
        return "OrderProxy{" +
                "order=" + order +
                '}';
    }
}
