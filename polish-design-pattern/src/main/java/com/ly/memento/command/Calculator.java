package com.ly.memento.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.revoke
 * @ClassName: Calculator
 * @Author: lin
 * @Description: 计算器类，有加法和减法按钮
 * @Date: 2019/8/3 11:13
 * @Version: 1.0
 */
public class Calculator {
    /**
     * 历史记录列表，用于撤销操作
     */
    List<Command> undoCmds = new ArrayList<> ();

    /**
     * 命令被撤销的历史记录，在恢复是使用
     */
    private List<Command> redoCmds = new ArrayList<> ();

    /**
     * 命令操作对应的备忘录对象的历史记录，在撤销时用
     * 数组有两个元素，第一个是命令执行前的状态，第二个是命令执行后的状态
     */
    private List<Memento[]> undoMementos = new ArrayList<> ();

    /**
     * 撤销命令对应的备忘录对象的历史记录，在恢复时用
     * 数组有两个元素，第一个是命令执行前的状态，第二个是命令执行后的状态
     */
    private List<Memento[]> redoMementos = new ArrayList<> ();

    /**
     * 持有加法的对象
     */
    private Command addCmd = null;
    /**
     * 持有减法的对象
     */
    private Command substractCmd = null;

    public void setAddCmd(Command addCmd) {
        this.addCmd = addCmd;
    }

    public void setSubstractCmd(Command substractCmd) {
        this.substractCmd = substractCmd;
    }

    /**
     * 加法按钮
     */
    public void addPressed() {
        // 获取对应的备忘录对象，并保存到相应的历史记录中
        Memento memento = this.addCmd.createMemento ();
        // 执行命令
        addCmd.execute ();
        // 将操作加入到历史记录中
        undoCmds.add (addCmd);

        // 获取命令执行后的备忘录对象
        Memento memento1 = this.addCmd.createMemento ();
        // 设置到撤销的历史记录中
        this.undoMementos.add (new Memento[]{memento, memento1});
    }

    /**
     * 减法按钮
     */
    public void substractPressed() {

        // 获取对应的备忘录对象，并保存到相应的历史记录中
        Memento memento = this.substractCmd.createMemento ();
        // 执行命令
        substractCmd.execute ();
        // 将操作加入到历史记录中
        undoCmds.add (substractCmd);

        // 获取命令执行后的备忘录对象
        Memento memento1 = this.substractCmd.createMemento ();
        // 设置到撤销的历史记录中
        this.undoMementos.add (new Memento[]{memento, memento1});


    }


    /**
     * 撤销操作的命令
     */
    public void undoPressed() {
        if (undoCmds.size () > 0) {
            // 取出最后一个命令
            Command command = this.undoCmds.get (this.undoCmds.size () - 1);
            // 获取相应的备忘录对象
            Memento[] mementos = undoMementos.get (this.undoCmds.size () - 1);
            // 撤销操作
            command.undo (mementos[0]);
            // 将撤销的命令加入，恢复列表，用于恢复撤销的操作
            redoCmds.add (command);
            // 将相应的备忘录也加入进去
            redoMementos.add (mementos);

            // 撤销后删除历史记录
            this.undoCmds.remove (command);
            // 删除对应的备忘录记录
            this.undoMementos.remove (mementos);
        } else {
            System.out.println ("暂无历史记录");
        }
    }


    /**
     * 恢复被撤销的命令
     */
    public void redoPressed() {
        if (this.redoCmds.size () > 0) {
            // 取出最后一次撤销操作，重新执行
            Command command = this.redoCmds.get (this.redoCmds.size () - 1);
            // 获取相应的备忘录对象
            Memento[] mementos = redoMementos.get (this.redoCmds.size () - 1);
            // 撤销操作
            command.undo (mementos[1]);
            // 将撤销的命令加入，恢复列表，用于恢复撤销的操作
            undoCmds.add (command);
            // 将相应的备忘录也加入进去
            undoMementos.add (mementos);

            // 将该操作从恢复队列中移除
            this.redoCmds.remove (command);
            // 删除对应的备忘录记录
            this.redoMementos.remove (mementos);
        } else {
            System.out.println ("暂无记录可恢复");
        }
    }
}
