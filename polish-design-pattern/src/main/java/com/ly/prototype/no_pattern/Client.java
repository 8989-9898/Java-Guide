package com.ly.prototype.no_pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.no_pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 不使用模式的订单处理系统
 * @Date: 2019/7/27 18:09
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        BusinessOrder businessOrder = new BusinessOrder();


        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setOrderProductNum(5690);
        personalOrder.setCustomerName("lisi");
        personalOrder.setProductId("P009");

        EnterpriseOrder enterpriseOrder = new EnterpriseOrder();
        enterpriseOrder.setOrderProductNum(7690);
        enterpriseOrder.setEnterpriseName("腾讯");
        enterpriseOrder.setProductId("P049");

        businessOrder.saveOrder(personalOrder);

        System.out.println("----------------------------------");
        businessOrder.saveOrder(enterpriseOrder);
    }
}
