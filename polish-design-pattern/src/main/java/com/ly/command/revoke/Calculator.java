package com.ly.command.revoke;

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
     * 持有加法的对象
     */
    private Command addCmd=null;
    /**
     * 持有减法的对象
     */
    private Command substractCmd=null;

    public void setAddCmd(Command addCmd) {
        this.addCmd = addCmd;
    }

    public void setSubstractCmd(Command substractCmd) {
        this.substractCmd = substractCmd;
    }

    /**
     * 加法按钮
     */
    public void addPressed(){
        addCmd.execute();
        // 将操作加入到历史记录中
        undoCmds.add(addCmd);
    }

    /**
     * 减法按钮
     */
    public void substractPressed(){
        substractCmd.execute();
        // 将操作加入到历史记录中
        undoCmds.add(substractCmd);
    }

    /**
     * 历史记录列表，用于撤销操作
     */
    List<Command> undoCmds=new ArrayList<>();

    /**
     * 撤销操作的命令
     */
    public void undoPressed(){
        if (undoCmds.size()>0) {
            Command command = this.undoCmds.get(this.undoCmds.size() - 1);
            // 执行正在的撤销操作
            command.undo();
            // 将撤销的命令加入，恢复列表，用于恢复撤销的操作
            redoCmds.add(command);
            // 撤销后删除历史记录
            this.undoCmds.remove(command);
        }else{
            System.out.println("暂无历史记录");
        }
    }

    /**
     * 命令被撤销的历史记录，在恢复是使用
     */
    private List<Command> redoCmds=new ArrayList<>();

    /**
     * 恢复被撤销的命令
     */
    public void redoPressed(){
        if (this.redoCmds.size()>0) {
            // 取出最后一次撤销操作，重新执行
            Command command = this.redoCmds.get(this.redoCmds.size() - 1);
            command.execute();
            // 将执行的操作加入，撤销队列
            this.undoCmds.add(command);
            // 将该操作从恢复队列中移除
            this.redoCmds.remove(command);
        }else{
            System.out.println("暂无记录可恢复");
        }
    }
}
