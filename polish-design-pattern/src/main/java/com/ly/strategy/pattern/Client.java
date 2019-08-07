package com.ly.strategy.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用策略模式的报价系统, 使用策略模式可以很容易的切换算法，和添加新的算法（只需要继承Strategy接口实现另一种算法即可，不用再修改原有的代码）
 *              策略模式的核心不是如何来实现这些算法，而是如何来组织、调用这些算法，从而让程序结构更灵活，具有更好的扩展性和维护性。
 *              策略模式是相同行为不同的实现
 * @Date: 2019/8/7 20:31
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Strategy old = new OldCustomerPrice();
        Strategy large = new LargeCustomerPrice();
        Price price = new Price(old);
        System.out.println("折扣后的价格是：" + price.quote(933.9));
        price = new Price(large);
        System.out.println("折扣后的价格是：" + price.quote(933.9));
    }
}
