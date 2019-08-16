package com.ly.decorator.no.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.no.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 不使用模式的奖金计算
 *               逻辑不够灵活，不能灵活的改变奖金的计算规则
 * @Date: 2019-08-15 16:08
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Price price = new Price ();
        double money = price.calcPrice ("张三", null, null);
        System.out.println ("=============>张三的奖金是：" + money);
        money = price.calcPrice ("李四", null, null);
        System.out.println ("=============>李四的奖金是：" + money);
        money = price.calcPrice ("王五", null, null);
        System.out.println ("=============>王五的奖金是：" + money);
        money = price.calcPrice ("赵六", null, null);
        System.out.println ("=============>赵六的奖金是：" + money);
    }
}
