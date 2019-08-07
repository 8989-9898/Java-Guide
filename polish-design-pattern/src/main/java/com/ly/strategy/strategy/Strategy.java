package com.ly.strategy.strategy;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.strategy
 * @ClassName: Strategy
 * @Author: lin
 * @Description: 策略接口用来约束一系列具体的策略算法。Context 通过这个接口调用具体的策略实现定义的算法
 * @Date: 2019/8/7 20:00
 * @Version: 1.0
 */
public interface Strategy {

    /**
     * 某个算法接口，可以有传入参数，也可以有返回值
     */
    public void algorethminterface();

}
