package com.ly.command.barbecue;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command
 * @ClassName: Command
 * @Author: lin
 * @Description: 命令抽象类
 * @Date: 2019/7/13 21:40
 * @Version: 1.0
 */
public abstract class Command {
    protected BarBecuer receiver;

    public Command(BarBecuer receiver) {
        this.receiver = receiver;
    }

    public abstract void excuteCommant();
}
