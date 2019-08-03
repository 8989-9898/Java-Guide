package com.ly.command.queue;

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

    private static List<Command> cmds=new ArrayList<>();

    /**
     * 服务员传入的一个菜单，需要同步
     * @param menu
     */
    public synchronized static void addMeun(MenuCommand menu){
        // 将菜单中点的菜全部放入到命令队列中
        cmds.addAll(menu.getCol());
    }


    /**
     * 厨师从命令队列中获取命令进行处理
     * @return
     */
    public synchronized static Command getOneCommand(){
        Command cmd=null;
        if (cmds.size()>0) {
            // 先下单的先做
            cmd=cmds.get(0);
            // 将开始做的订单移除
            cmds.remove(0);
        }
        return cmd;
    }

}
