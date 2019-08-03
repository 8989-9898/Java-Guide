package com.ly.command.degeneration2;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.degeneration
 * @ClassName: Client
 * @Author: lin
 * @Description: 客户端
 * @Date: 2019/8/3 17:44
 * @Version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        Command server = new PrintServer("退化的命令模式");

        Invoker invoker = new Invoker();

        // 开始打印输出
        invoker.startPrint(server);
    }
}
