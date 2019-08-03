package com.ly.command.degeneration;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.degeneration
 * @ClassName: Invoker
 * @Author: lin
 * @Description: 持有者
 * @Date: 2019/8/3 17:43
 * @Version: 1.0
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 开始打印
     */
    public void startPrint(){
        // 执行命令
        command.execute();
    }
}
