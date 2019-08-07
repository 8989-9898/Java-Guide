package com.ly.strategy.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.pattern
 * @ClassName: Strategy
 * @Author: lin
 * @Description: 策略模式，定义报价计算的接口
 * @Date: 2019/8/7 20:24
 * @Version: 1.0
 */
public interface Strategy {

    /**
     * 计算应报价格的接口
     * @param goodsPrice 原价
     * @return 计算出来应报的价格
     */
    public double calcPrice(double goodsPrice);

}
