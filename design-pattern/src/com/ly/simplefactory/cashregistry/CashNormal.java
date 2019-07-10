package com.ly.simplefactory.cashregistry;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.cashregistry
 * @ClassName: CashNormal
 * @Author: lin
 * @Description: 正常收费类
 * @Date: 2019-07-05 11:02
 * @Version: 1.0
 */
public class CashNormal implements CashSuper{

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
