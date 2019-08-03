package com.ly.command.parameterization;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.parameterization
 * @ClassName: ResetCommand
 * @Author: lin
 * @Description: 重启命令的实现
 * @Date: 2019/8/3 10:06
 * @Version: 1.0
 */
public class ResetCommand implements Command {

    /**
     * 持有真正的命令接收者---- 主板
     */
    private MainBoardApi board=null;

    public ResetCommand(MainBoardApi board) {
        this.board = board;
    }

    @Override
    public void execute() {
        // 实际调用接收者的方法，执行重启操作
        board.reset();
    }
}
