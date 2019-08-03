package com.ly.command.log;

import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.queue
 * @ClassName: CommandQueue
 * @Author: lin
 * @Description: 命令队列
 * @Date: 2019/8/3 16:37
 * @Version: 1.0
 */
public class CommandQueue {

    private static final String PATH_NAME = "/command/order.log";

    private static List<Command> cmds = null;

    static {
        // 初始化时检查，是否存在未处理的历史命令
        cmds = FileUtil.readFile(PATH_NAME);
        if (cmds == null) {
            cmds = new ArrayList<>();
        }
    }

    /**
     * 服务员传入的一个菜单，需要同步
     *
     * @param menu
     */
    public synchronized static void addMeun(MenuCommand menu) {
        // 将菜单中点的菜全部放入到命令队列中
        cmds.addAll(menu.getCol());
        // 写入日志
        FileUtil.writeFile(PATH_NAME,cmds);
    }


    /**
     * 厨师从命令队列中获取命令进行处理
     *
     * @return
     */
    public synchronized static Command getOneCommand() {
        Command cmd = null;
        if (cmds.size() > 0) {
            // 先下单的先做
            cmd = cmds.get(0);
            // 将开始做的订单移除
            cmds.remove(0);
            // 写入日志
            FileUtil.writeFile(PATH_NAME,cmds);
        }
        return cmd;
    }

}
