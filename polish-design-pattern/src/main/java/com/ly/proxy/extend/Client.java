package com.ly.proxy.extend;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.proxy.protection
 * @ClassName: Client
 * @Author: lin
 * @Description: 保护代理的实例,使用继承实现代理
 * @Date: 2019-07-31 9:22
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 王五创建一条订单
        Order proxy = new OrderProxy("深入研究JVM虚拟机", "王五", 200);
        // 赵六想要修改订单
        proxy.setOrderNum(100,"赵六");
        System.out.println("赵六修改的订单没有变化"+proxy);
        // 王五修改订单
        proxy.setOrderNum(30,"王五");
        System.out.println("王五修改的订单"+proxy);
    }
}
