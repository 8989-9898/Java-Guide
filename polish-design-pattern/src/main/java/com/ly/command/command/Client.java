package com.ly.command.command;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.command
 * @ClassName: Client
 * @Author: lin
 * @Description: 客户端，负责创建命令对象，并设定他的接受者
 * @Date: 2019/8/3 9:23
 * @Version: 1.0
 */
public class Client {

    public void assemble(){
        // 创建接受者
        Receiver receiver = new Receiver();
        // 创建命令对象，设定他的接受者
        Command command=new ConcreteCommand(receiver);
        // 创建 Invoker（调用者） ，将命定对象设置进去
        Invoker invoker = new Invoker(command);
        // 调用某种命令
        invoker.printCommand();
    }

}
