package com.ly.strategy.salary;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.salary
 * @ClassName: Client
 * @Author: lin
 * @Description: ${DESCRIPTION}
 * @Date: 2019/8/7 20:54
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建相应的策略算法
        PaymentStrategy rmbCash = new RMBCash();
        PaymentStrategy dollarCash = new DollarCash();
        // 创建两个使用不同算法的上下文对象
        PaymentContext context = new PaymentContext("张三", 5000, rmbCash);
        PaymentContext context2 = new PaymentContext("flank", 9000, dollarCash);
        context.pay();
        context2.pay();


        // 新增的支付方式,由于改变了策略模式的算法定义第一种扩展方式
        PaymentStrategy card = new Card();
        PaymentContext2 context21 = new PaymentContext2("Helen", 9000, card, "0903010708088");
        context21.pay();

        // 新增的支付方式,由于改变了策略模式的算法定义第一种扩展方式
        Card2 card2 = new Card2("9898232323");
        PaymentContext context1 = new PaymentContext("李四", 10000, card2);
        context1.pay();
    }
}
