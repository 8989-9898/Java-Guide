package com.ly.memento.command;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.revoke
 * @ClassName: AddCommand
 * @Author: lin
 * @Description: 加法命令实现
 * @Date: 2019/8/3 11:07
 * @Version: 1.0
 */
public class AddCommand extends AbstractCommand {

    /**
     * 操作数
     */
    private int num;

    public AddCommand( int num) {
        this.num=num;
    }

    @Override
    public void execute() {
        // 转调接收者执行真正的加法操作
        this.operation.add (num);
    }
}
