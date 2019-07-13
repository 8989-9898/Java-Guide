package com.ly.command.barbecue;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.barbecue
 * @ClassName: BakeChickenWingCommand
 * @Author: lin
 * @Description: 烤鸡翅的命令
 * @Date: 2019/7/13 21:50
 * @Version: 1.0
 */
public class BakeChickenWingCommand extends Command{
    public BakeChickenWingCommand(BarBecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommant() {
        receiver.bakeChickenWing();
    }
}
