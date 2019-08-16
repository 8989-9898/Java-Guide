package com.ly.chain.of.responsibility.functional.chain;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.functional.chain
 * @ClassName: Client
 * @Author: lin
 * @Description: 功能链，每个功能链负责处理一个功能，由多个功能组合成为功能链。
 * @Date: 2019-08-16 14:14
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        GoodsSaleEbo ebo = new GoodsSaleEbo ();
        SaleModel model = new SaleModel ("深入学习 JVM 虚拟机", 30);
        ebo.sale ("王五","里斯",model);
        ebo.sale ("赵六","里斯",model);
    }
}
