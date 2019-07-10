package com.ly.strategy;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.strategy;
 * @ClassName: CashSuper
 * @Author: lin
 * @Description: 超市收银的接口，使用策略模式，该类时抽象策略
 * @Date: 2019-07-05 10:55
 * @Version: 1.0
 */
public interface CashSuper {
    /**
     * 收银优惠计算接口
     * @param money
     * @return
     */
    double acceptCash(double money);
}
