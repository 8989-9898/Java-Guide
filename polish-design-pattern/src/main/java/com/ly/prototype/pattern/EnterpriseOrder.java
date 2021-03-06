package com.ly.prototype.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.no_pattern
 * @ClassName: EnterpriseOrder
 * @Author: lin
 * @Description: 企业订单
 * @Date: 2019/7/27 18:16
 * @Version: 1.0
 */
public class EnterpriseOrder implements OrderApi {
    /**
     * 购买人姓名
     */
    private String enterpriseName;

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

    @Override
    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    @Override
    public OrderApi orderClone() {
        // 使用克隆的方法克隆自身的属性
        EnterpriseOrder enterpriseOrder = new EnterpriseOrder();
        enterpriseOrder.setEnterpriseName(this.getEnterpriseName());
        enterpriseOrder.setProductId(this.getProductId());
        enterpriseOrder.setOrderProductNum(this.getOrderProductNum());
        return enterpriseOrder;
    }

    @Override
    public String toString() {
        return "企业订单的订购企业是：" + enterpriseName +
                "，订购的产品是:" + productId +
                ", 数量:" + orderProductNum +
                '}';
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
