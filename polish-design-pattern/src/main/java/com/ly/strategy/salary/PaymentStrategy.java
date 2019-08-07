package com.ly.strategy.salary;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.salary
 * @ClassName: PaymentStrategy
 * @Author: lin
 * @Description: 定义工资的发放接口，有多种发放工资的方式如，现金、银行卡、现金加股票、现金加期权、美元支付等。
 * @Date: 2019/8/7 20:43
 * @Version: 1.0
 */
public interface PaymentStrategy {

    /**
     * 公司给某人支付工资
     * @param context 支付工资的上下文，里面包含算法需要的数据
     */
    void pay(PaymentContext context);
}
