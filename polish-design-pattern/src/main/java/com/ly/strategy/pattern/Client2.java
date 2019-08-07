package com.ly.strategy.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 测试新增的算法实现
 * @Date: 2019/8/7 20:31
 * @Version: 1.0
 */
public class Client2 {
    public static void main(String[] args) {
        Strategy cooperate = new CooperateCustomerPrice();
        Price price = new Price(cooperate);
        System.out.println("折扣后的价格是：" + price.quote(933.9));
    }
}
