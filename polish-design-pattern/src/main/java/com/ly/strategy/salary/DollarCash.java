package com.ly.strategy.salary;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.salary
 * @ClassName: RMBCash
 * @Author: lin
 * @Description: 使用美元支付的实现
 * @Date: 2019/8/7 20:48
 * @Version: 1.0
 */
public class DollarCash implements PaymentStrategy{


    @Override
    public void pay(PaymentContext context) {
        System.out.println("现在给 "+context.getUsername()+" 美元现金支付 "+context.getMoney()+" 元");
    }
}
