package com.ly.command.barbecue;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.barbecue
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019/7/13 21:59
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        BarBecuer barBecuer = new BarBecuer();
        BakeChickenWingCommand command1 = new BakeChickenWingCommand(barBecuer);
        BakeChickenWingCommand command2 = new BakeChickenWingCommand(barBecuer);
        BakeMuttonCommand command3 = new BakeMuttonCommand(barBecuer);
        BakeMuttonCommand command4 = new BakeMuttonCommand(barBecuer);
        Waiter waiter = new Waiter();
        waiter.setOrder(command1);
        waiter.setOrder(command2);
        waiter.setOrder(command3);
        waiter.setOrder(command4);
        waiter.cancelOrder(command3);
        waiter.notifys();
    }
}
