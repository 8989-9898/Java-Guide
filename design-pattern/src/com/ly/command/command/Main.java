package com.ly.command.command;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.command
 * @ClassName: Main
 * @Author: lin
 * @Description: 命令模式：将一个请求封装为一个对象，从而使你可以使用不同的请求对客户实行参数化。对请求排队或者记录日志
 *                      ，以及支持可撤销操作。
 * @Date: 2019/7/13 22:11
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Command commandA = new ConcreteCommandA(new Receiver());
        Invoker invoker = new Invoker(commandA);
        invoker.excuteCommand();
    }
}
