package com.ly.simplefactory.cashregistry;

/**
 * @ProjectName: idea_workspace
 * @Package: simplefactory.com.ly.simplefactory.cashregistry
 * @ClassName: CashSuper
 * @Author: lin
 * @Description: 超市收银的接口
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
