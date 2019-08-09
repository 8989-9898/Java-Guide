package com.ly.memento.command;

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
     * 撤销命令，恢复到备忘录对象记录的状态
     * @param m 备忘录对象
     */
    public void undo(Memento m);

    /**
     * 重做命令，恢复到备忘录对象记录的状态
     * @param m 备忘录对象
     */
    public void redo(Memento m);

    /**
     * 创建保存原发器状态的备忘录
     * @return 创建好的备忘录对象
     */
    public Memento createMemento();

}
