package com.ly.strategy.strategy;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.strategy
 * @ClassName: ConcreteStrategyA
 * @Author: lin
 * @Description:
 * @Date: 2019/8/7 20:17
 * @Version: 1.0
 */
public class ConcreteStrategyA implements Strategy{

    @Override
    public void algorethminterface() {
        System.out.println("策略模式的具体的算法实现A");
    }
}
