package com.ly.command.computer;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.computer
 * @ClassName: OpanCommand
 * @Author: lin
 * @Description: 开机命令
 * @Date: 2019/8/3 9:42
 * @Version: 1.0
 */
public class OpanCommand implements Command {

    /**
     * 主板接口，不需要知道具体的主板实现类
     */
    private MainBoardApi board = null;

    /**
     * 传入主板对象
     * @param board
     */
    public OpanCommand(MainBoardApi board) {

        this.board = board;
    }

    @Override
    public void execute() {
        // 命令对象是不知道如何开机的，所以只能调用能开机的方法
        // 执行主板的开机方法
        board.open();
        // 这样客户端就和主板完全解耦，有命令对象去调用具体的主板方法
    }
}
