package com.ly.command.command;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.command
 * @ClassName: ConcreteCommand
 * @Author: lin
 * @Description: 具体的某种命令的实现
 * @Date: 2019/8/3 9:14
 * @Version: 1.0
 */
public class ConcreteCommand implements Command {

    /**
     * 持有相应的接受者对象
     */
    private Receiver receiver = null;

    /**
     * 命令对象可以有自己的状态
     */
    private String state;

    /**
     * 使用构造方法传入相应的接受者对象，执行真正的命令
     *
     * @param receiver
     */
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 在命令对象的执行方法中调用，接受者的方法执行真正的命令
        receiver.action();
    }
}
