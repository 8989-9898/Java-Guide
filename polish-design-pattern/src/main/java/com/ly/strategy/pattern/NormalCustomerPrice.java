package com.ly.strategy.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.pattern
 * @ClassName: NormalCustomerPrice
 * @Author: lin
 * @Description: 新客户和普通客户的计算方法
 * @Date: 2019/8/7 20:26
 * @Version: 1.0
 */
public class NormalCustomerPrice implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("新客户和普通客户没有折扣");
        return goodsPrice;
    }
}
