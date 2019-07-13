package com.ly.command.barbecue;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.barbecue
 * @ClassName: BakeMuttonCommand
 * @Author: lin
 * @Description: 烤羊肉串的命令
 * @Date: 2019/7/13 21:48
 * @Version: 1.0
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(BarBecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommant() {
        receiver.bakeMutton();
    }
}
