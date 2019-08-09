package com.ly.memento.command;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.memento.command
 * @ClassName: AbstractCommand
 * @Author: lin
 * @Description: 命令对象的公共对象，实现各个命令对象的公共功能
 * @Date: 2019-08-09 17:05
 * @Version: 1.0
 */
public abstract class AbstractCommand implements Command {


    /**
     * 持有真正命令的执行对象
     */
    protected OperationApi operation = null;

    public void setOperation(OperationApi operation) {
        this.operation = operation;
    }

    @Override
    public Memento createMemento() {
        return this.operation.createMemento ();
    }

    @Override
    public void undo(Memento m) {
        this.operation.setMemento (m);
    }

    @Override
    public void redo(Memento m) {
        this.operation.setMemento (m);
    }
}
