package com.ly.command.orderdishes;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.orderdishes
 * @ClassName: Waiter
 * @Author: 服务员类，复责组合菜单，复制组装每个菜和具体的实现者，还负责调用，相当于 Invoker 和 Client 的结合
 * @Date: 2019/8/3 15:51
 * @Version: 1.0
 */
public class Waiter {

    /**
     * 拥有一个宏对象---菜单
     */
    private MenuCommand menu = new MenuCommand();


    /**
     * 客户点菜，负责组装命令对象和接受者对象
     *
     * @param command
     */
    public void orderDish(Command command) {
        // 创建具体的接收者
        CookApi hot = new HotCook();
        CookApi cool = new CoolCook();

        // 判断是凉菜和是热菜
        if (command instanceof DuckCommand) {
            ((DuckCommand) command).setApi(hot);
        } else if (command instanceof ChopCommand) {
            ((ChopCommand) command).setApi(hot);
        } else if (command instanceof PorkCommand) {
            ((PorkCommand) command).setApi(cool);
        }

        // 加入菜单
        menu.add(command);
    }


    /**
     * 点菜完毕
     */
    public void orderOver() {
        menu.execute();
    }


}
