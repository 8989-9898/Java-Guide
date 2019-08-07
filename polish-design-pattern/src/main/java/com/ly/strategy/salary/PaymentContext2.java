package com.ly.strategy.salary;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.salary
 * @ClassName: PaymentContext
 * @Author: lin
 * @Description: 扩展上下文对象，实现使用银行卡支付工资
 * @Date: 2019/8/7 20:46
 * @Version: 1.0
 */
public class PaymentContext2 extends PaymentContext{


    /**
     * 银行卡号
     */
    private String account=null;

    /**
     * 传入被支付工资的人员，和支付的金额支付的策略
     * @param username  被支付工资的人员
     * @param money  支付的金额
     * @param strategy 支付的策略
     * @param account 银行卡号
     */
    public PaymentContext2(String username, double money, PaymentStrategy strategy, String account) {
        super(username, money, strategy);
        this.account = account;
    }

    public String getAccount() {
        return account;
    }
}
