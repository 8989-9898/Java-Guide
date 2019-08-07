package com.ly.strategy.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.pattern
 * @ClassName: Price
 * @Author: lin
 * @Description: 价格计算和管理类，相当于策略模式中的上下文对象
 * @Date: 2019/8/7 20:29
 * @Version: 1.0
 */
public class Price {
    private Strategy strategy;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 报价，计算对客户的报价
     *
     * @param price 原价
     * @return 折扣价
     */
    public double quote(double price) {
        return strategy.calcPrice(price);
    }
}
