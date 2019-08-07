package com.ly.strategy.salary;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.salary
 * @ClassName: Card
 * @Author: lin
 * @Description: 银行卡支付的策略实现的第二种扩展方式，改变实现策略模式接实现类的实现，添加属性
 * @Date: 2019/8/7 21:02
 * @Version: 1.0
 */
public class Card2 implements PaymentStrategy {

    /**
     * 银行卡号
     */
    private String account;

    public Card2(String account) {
        this.account = account;
    }

    @Override
    public void pay(PaymentContext context) {
        // 转换为这个新的算法自己知道需要的对象
        System.out.println("现在给 "+context.getUsername()+" 的 "+account+" 账号支付了 "+context.getMoney()+" 元");
    }
}
