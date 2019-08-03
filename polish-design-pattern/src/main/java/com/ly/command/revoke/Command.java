package com.ly.command.revoke;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.revoke
 * @ClassName: Command
 * @Author: lin
 * @Description: 命令接口，支持运算和撤销功能
 * @Date: 2019/8/3 11:05
 * @Version: 1.0
 */
public interface Command {

    /**
     * 执行命令对应的操作
     */
    public void execute();

    /**
     * 执行撤销命令的操作
     */
    public void undo();
}
