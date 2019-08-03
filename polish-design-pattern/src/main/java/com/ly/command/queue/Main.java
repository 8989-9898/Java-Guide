package com.ly.command.queue;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.orderdishes
 * @ClassName: Main
 * @Author: lin
 * @Description: 宏命令
 * @Date: 2019/8/3 16:01
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {

        // 先让厨师运行起来
        CookManager.renManager();

        for (int i = 0; i < 10; i++) {
            // 创建服务员
            Waiter waiter = new Waiter();

            // 创建命令对象
            Command duck = new DuckCommand(i);
            Command chop = new ChopCommand(i);
            Command pork = new PorkCommand(i);

            // 开始点菜，就是让服务员距离这些命令
            waiter.orderDish(duck);
            waiter.orderDish(chop);
            waiter.orderDish(pork);
            // 点菜完毕,有服务员通知后厨，开始做菜
            waiter.orderOver();
        }





    }
}
