package com.ly.strategy;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.strategy
 * @ClassName: ContentCash
 * @Author: lin
 * @Description: 策略模式实现类
 * @Date: 2019-07-05 13:25
 * @Version: 1.0
 */
public class ContentCash {

    private CashSuper cashSuper;

    /**
     * 纯粹的策略模式，根据传入的具体实现类来操作
     * @param cashSuper
     */
    public ContentCash(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    /**
     * 策略模式和简单工厂模式的结合
     * @param type
     */
    public ContentCash(String type) {
        switch (type) {
            case "1":
                cashSuper = new CashNormal();
                break;
            case "3":
                cashSuper = new CashReturn(300,50);
                break;
            case "2":
                cashSuper = new CashRebate(0.5);
                break;
            default:
                cashSuper = new CashNormal();
        }
    }

    public double getResult(double money){
        // 在策略模式中根据具体的实现类调用具体需要的方法
        return cashSuper.acceptCash(money);
    }
}
