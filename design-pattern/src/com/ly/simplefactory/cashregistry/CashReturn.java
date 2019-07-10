package com.ly.simplefactory.cashregistry;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.cashregistry
 * @ClassName: CashReturn
 * @Author: lin
 * @Description: 满多少减多少的实现类
 * @Date: 2019-07-05 11:10
 * @Version: 1.0
 */
public class CashReturn implements CashSuper {

    /**
     * 返利条件
     */
    private double condition;
    /**
     * 返利数
     */
    private double returnMonry;

    public CashReturn(double condition, double returnMonry) {
        this.condition = condition;
        this.returnMonry = returnMonry;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= condition) {
            result = money - Math.floor(money / condition) * returnMonry;
        }
        return result;
    }
}
