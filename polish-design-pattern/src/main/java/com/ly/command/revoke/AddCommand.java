package com.ly.command.revoke;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.revoke
 * @ClassName: AddCommand
 * @Author: lin
 * @Description: 加法命令实现
 * @Date: 2019/8/3 11:07
 * @Version: 1.0
 */
public class AddCommand implements Command {

    /**
     * 持有相因的命令对象
     */
    private OperationApi api = null;

    /**
     * 操作数
     */
    private int num;

    public AddCommand(OperationApi api,int num) {
        this.num=num;
        this.api = api;
    }

    @Override
    public void execute() {
        // 转调接收者执行真正的加法操作
        api.add(num);
    }

    @Override
    public void undo() {
        // 撤销操作，其实就是调用减法操作
        api.substract(num);
    }
}
