package com.ly.prototype.depth_clone;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.no_pattern
 * @ClassName: PersonalOrder
 * @Author: lin
 * @Description: 个人订单对象, 使用java 的克隆接口方法
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

    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    @Override
    public OrderApi cloneOrder() {
        // 使用自定的克隆方法
        PersonalOrder order = new PersonalOrder();
        // 使用自定的克隆方法，实现的深度克隆
        order.setProduct((Product) this.product.cloneProduct());
        order.setCustomerName(this.customerName);
        order.setOrderProductNum(this.orderProductNum);
        order.setProductId(this.productId);
        return order;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // 使用 java 原生的克隆实现深度克隆
        PersonalOrder order;
        order = (PersonalOrder) super.clone();
        order.setProduct((Product) this.product.clone());
        return super.clone();
    }

    @Override
    public String toString() {
        return "个人订单的订购人是：" + customerName +
                "，订购的产品名是:" + this.product.getName() +
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
        this.product.setProductId(productId);
        this.productId = productId;
    }
}
