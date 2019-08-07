package com.ly.strategy.salary;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.salary
 * @ClassName: RMBCash
 * @Author: lin
 * @Description: 使用人民币支付的实现
 * @Date: 2019/8/7 20:48
 * @Version: 1.0
 */
public class RMBCash implements PaymentStrategy{


    @Override
    public void pay(PaymentContext context) {
        System.out.println("现在给 "+context.getUsername()+" 人民币现金支付 "+context.getMoney()+" 元");
    }
}
