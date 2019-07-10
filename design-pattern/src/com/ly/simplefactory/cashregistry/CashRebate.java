package com.ly.simplefactory.cashregistry;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.cashregistry
 * @ClassName: CashRebate
 * @Author: lin
 * @Description: 折扣收费子类
 * @Date: 2019-07-05 11:03
 * @Version: 1.0
 */
public class CashRebate implements CashSuper{

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
