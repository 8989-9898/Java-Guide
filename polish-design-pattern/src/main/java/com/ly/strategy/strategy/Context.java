package com.ly.strategy.strategy;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.strategy
 * @ClassName: Context
 * @Author: lin
 * @Description: 上下文对象，负责和具体的策略模式交互
 * @Date: 2019/8/7 20:18
 * @Version: 1.0
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 上下文对象提供的操作接口
     */
    public void contextInterface(){
        strategy.algorethminterface();
    }
}
