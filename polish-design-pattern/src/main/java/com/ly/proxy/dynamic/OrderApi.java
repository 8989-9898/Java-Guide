package com.ly.proxy.dynamic;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.proxy.protection
 * @ClassName: OrderApi
 * @Author: lin
 * @Description: 订单操作的接口
 * @Date: 2019-07-31 9:25
 * @Version: 1.0
 */
public interface OrderApi {
    public String getProductName();

    public void setProductName(String productName, String user);

    public String getOrderUser();

    public void setOrderUser(String orderUser, String user);

    public int getOrderNum();

    public void setOrderNum(int orderNum, String user);
}
