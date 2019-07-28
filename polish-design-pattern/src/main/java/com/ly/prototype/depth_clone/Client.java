package com.ly.prototype.depth_clone;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.depth_clone
 * @ClassName: Client
 * @Author: lin
 * @Description: 深度克隆
 * @Date: 2019/7/28 11:19
 * @Version: 1.0
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Product product = new Product();
        product.setName("棋牌");

        PersonalOrder order = new PersonalOrder();
        order.setProduct(product);
        order.setProductId("P9902");
        order.setOrderProductNum(5003);
        order.setCustomerName("flank");

        // 调用自定义的克隆方法
        OrderApi orderApi = order.cloneOrder();
        orderApi.setOrderProductNum(6000);
        // 调用java 的克隆方法
        PersonalOrder clone = (PersonalOrder) order.clone();
        clone.setOrderProductNum(8000);
        System.out.println(order);
        System.out.println(orderApi);
        System.out.println(clone);

    }
}
