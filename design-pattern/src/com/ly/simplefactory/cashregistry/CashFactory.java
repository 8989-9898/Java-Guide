package com.ly.simplefactory.cashregistry;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.cashregistry
 * @ClassName: CashFactory
 * @Author: lin
 * @Description: 收费工厂类
 * @Date: 2019-07-05 11:17
 * @Version: 1.0
 */
public class CashFactory {
    public static CashSuper newInstance(String type) {
        /**
         * 如果要添加积分服务（100块钱1积分）时，就要添加新的类了和修改工厂方法。不够灵活
         * 可以使用策略模式来代替
         */
        CashSuper cashSuper = null;
        switch (type) {
            case "1":
                cashSuper = new CashNormal();
                break;
            case "2":
                /**
                 * 可以在这里让输入值
                 */
                cashSuper = new CashRebate(0.5);
                break;
            case "3":
                /**
                 * 可以在这里让输入值
                 */
                cashSuper = new CashReturn(300,50);
                break;
            default:
                cashSuper = new CashNormal();
        }
        return cashSuper;
    }
}
