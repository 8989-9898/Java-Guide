package com.ly.strategy.salary;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.salary
 * @ClassName: Card
 * @Author: lin
 * @Description: 银行卡支付的策略实现
 * @Date: 2019/8/7 21:02
 * @Version: 1.0
 */
public class Card implements PaymentStrategy {
    @Override
    public void pay(PaymentContext context) {
        // 转换为这个新的算法自己知道需要的对象
        PaymentContext2 context2= (PaymentContext2) context;
        System.out.println("现在给 "+context2.getUsername()+" 的 "+context2.getAccount()+" 账号支付了 "+context2.getMoney()+" 元");
    }
}
