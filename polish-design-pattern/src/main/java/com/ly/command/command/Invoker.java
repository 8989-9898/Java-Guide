package com.ly.command.command;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.command
 * @ClassName: Invoker
 * @Author: lin
 * @Description: 调用者，调用具体的命令对对象
 * @Date: 2019/8/3 9:21
 * @Version: 1.0
 */
public class Invoker {

    /**
     * 持有具体的命令接口
     */
    private Command command;

    /**
     * 使用构造方法传入具体的命令对象
     * @param command
     */
    public Invoker(Command command) {
        this.command = command;
    }


    /**
     * 示意方法，执行打印操作
     */
    public void printCommand(){
        // 调用具体的命令对象，执行相关的命令
        command.execute();
    }
}
