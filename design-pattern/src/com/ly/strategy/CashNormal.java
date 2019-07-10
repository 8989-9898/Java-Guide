package com.ly.strategy;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.strategy;
 * @ClassName: CashNormal
 * @Author: lin
 * @Description: 正常收费类，具体的策略实现类
 * @Date: 2019-07-05 11:02
 * @Version: 1.0
 */
public class CashNormal implements CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
