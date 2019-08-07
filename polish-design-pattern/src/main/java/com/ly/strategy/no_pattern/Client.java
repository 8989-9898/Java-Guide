package com.ly.strategy.no_pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.no_pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 不使用设计模式是的计算折扣客户端，改中方法不容易扩展，需要添加折扣种类需要修改 Price 类
 *               违反了开闭原则。
 * @Date: 2019/8/7 19:55
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Price price = new Price();
        double quote = price.quote(400.0, "新客户");
        System.out.println("折扣后的价格是："+quote);
    }
}
