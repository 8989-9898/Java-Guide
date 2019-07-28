package com.ly.prototype.no_pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.no_pattern
 * @ClassName: OrderApi
 * @Author: lin
 * @Description: 订单接口
 * @Date: 2019/7/27 18:07
 * @Version: 1.0
 */
public interface OrderApi {

    /**
     * 获取订单商品数量
     * @return
     */
    public int getOrderProductNum();

    /**
     * 设置订单商品数量
     */
    public void setOrderProductNum(int num);

}
