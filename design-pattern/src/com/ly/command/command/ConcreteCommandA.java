package com.ly.command.command;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.command
 * @ClassName: ConcreteCommandA
 * @Author: lin
 * @Description: 具体的命令类
 * @Date: 2019/7/13 22:08
 * @Version: 1.0
 */
public class ConcreteCommandA extends Command {
    public ConcreteCommandA(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void excute() {
        receiver.action();
    }
}
