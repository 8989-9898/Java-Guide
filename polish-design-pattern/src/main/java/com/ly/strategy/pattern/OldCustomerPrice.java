package com.ly.strategy.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.pattern
 * @ClassName: OldCustomerPrice
 * @Author: lin
 * @Description: 老客户的计算方法
 * @Date: 2019/8/7 20:27
 * @Version: 1.0
 */
public class OldCustomerPrice implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("老客户统一折扣 5%");
        return goodsPrice*(1-0.05);
    }
}
