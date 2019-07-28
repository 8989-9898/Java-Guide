package com.ly.prototype.depth_clone;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.no_pattern
 * @ClassName: OrderApi
 * @Author: lin
 * @Description: 订单接口,继承java的克隆接口
 * @Date: 2019/7/27 18:07
 * @Version: 1.0
 */
public interface OrderApi extends Cloneable {

    /**
     * 获取订单商品数量
     * @return
     */
    public int getOrderProductNum();
    public void setOrderProductNum(int num);

    /**
     * 自定义的深度克隆方法
     * @return
     */
    public OrderApi cloneOrder();

}
