package com.ly.prototype.java_clone;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用原型模式的事例
 * @Date: 2019/7/28 10:35
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        EnterpriseOrder enterpriseOrder = new EnterpriseOrder();
        enterpriseOrder.setOrderProductNum(7690);
        enterpriseOrder.setEnterpriseName("腾讯");
        enterpriseOrder.setProductId("P049");
        EnterpriseOrder clone = (EnterpriseOrder)enterpriseOrder.clone();

        clone.setOrderProductNum(4000);

        System.out.println(enterpriseOrder);
        System.out.println(clone);
    }

    /**
     * 一般在使用原型模式的时候使用的java 自带的 clone() 方法。此处自是表示
     * 原型模式的功能：一个是通过克隆来创建新的对象事例，一个是为克隆出来的对象复制原型实例属性的值。
     * 
     * */
}
