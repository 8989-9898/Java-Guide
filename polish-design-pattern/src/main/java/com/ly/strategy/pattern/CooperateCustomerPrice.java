package com.ly.strategy.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.pattern
 * @ClassName: CooperateCustomerPrice
 * @Author: lin
 * @Description: 新增的战略合作伙伴
 * @Date: 2019/8/7 20:39
 * @Version: 1.0
 */
public class CooperateCustomerPrice implements Strategy {

    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("战略合作伙伴，统一 80%");
        return goodsPrice * (1 - 0.2);
    }
}
