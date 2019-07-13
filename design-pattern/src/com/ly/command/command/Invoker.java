package com.ly.command.command;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.command
 * @ClassName: Invoker
 * @Author: lin
 * @Description: 下达命令者
 * @Date: 2019/7/13 22:10
 * @Version: 1.0
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void excuteCommand() {
        command.excute();
    }
}
