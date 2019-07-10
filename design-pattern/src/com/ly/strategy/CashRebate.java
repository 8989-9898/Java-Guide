package com.ly.strategy;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.strategy;
 * @ClassName: CashRebate
 * @Author: lin
 * @Description: 折扣收费子类，具体的策略实现类
 * @Date: 2019-07-05 11:03
 * @Version: 1.0
 */
public class CashRebate implements CashSuper {

    /**
     * 折扣数
     */
    private double moneyRebate = 0;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
