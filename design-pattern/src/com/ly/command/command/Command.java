package com.ly.command.command;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.command
 * @ClassName: Command
 * @Author: lin
 * @Description: 命令抽象类
 * @Date: 2019/7/13 22:04
 * @Version: 1.0
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void excute();
}
