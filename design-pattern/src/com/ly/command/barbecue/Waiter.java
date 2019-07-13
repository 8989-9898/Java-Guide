package com.ly.command.barbecue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.barbecue
 * @ClassName: Waiter
 * @Author: lin
 * @Description: 服务员类，执行下命令的操作
 * @Date: 2019/7/13 21:51
 * @Version: 1.0
 */
public class Waiter {

    private List<Command> commands=new ArrayList<>();

    public void cancelOrder(Command command){
        this.commands.remove(command);
        System.out.println("取消订单"+command.getClass().getName()+" 时间："+(new Date()));
    }

    public void setOrder(Command command){
        if (command.getClass().getSimpleName().equalsIgnoreCase("BakeChickenWingCommand")) {
            System.out.println("服务员：鸡翅没有了，请点其它食品");
        }else {
            this.commands.add(command);
            System.out.println("增加订单" + command.getClass().getName() + " 时间：" + (new Date()));
        }
    }

    public void notifys(){
        commands.forEach((e)->e.excuteCommant());
    }
}
