package com.ly.strategy.salary;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.salary
 * @ClassName: PaymentContext
 * @Author: lin
 * @Description: 支付工资的上下文，每个人的工作不同，支付的方式也不同
 * @Date: 2019/8/7 20:46
 * @Version: 1.0
 */
public class PaymentContext {

    private String username;
    private double money;

    private PaymentStrategy strategy;

    public void pay(){
        strategy.pay(this);
    }

    public PaymentContext(String username, double money, PaymentStrategy strategy) {
        this.username = username;
        this.money = money;
        this.strategy = strategy;
    }

    public String getUsername() {
        return username;
    }

    public double getMoney() {
        return money;
    }

}
