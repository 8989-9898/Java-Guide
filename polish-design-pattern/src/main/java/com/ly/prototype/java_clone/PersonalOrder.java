package com.ly.prototype.java_clone;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.no_pattern
 * @ClassName: PersonalOrder
 * @Author: lin
 * @Description: 个人订单对象,使用java 的克隆接口方法
 * @Date: 2019/7/27 18:10
 * @Version: 1.0
 */
public class PersonalOrder implements OrderApi {

    /**
     * 购买人姓名
     */
    private String customerName;

    /**
     * 商品编号
     */
    private String productId;

    /**
     * 商品数量
     */
    private int orderProductNum;


    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "个人订单的订购人是：" + customerName +
                "，订购的产品是:" + productId +
                ", 数量:" + orderProductNum +
                '}';
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
