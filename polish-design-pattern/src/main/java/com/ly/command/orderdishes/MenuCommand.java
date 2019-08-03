package com.ly.command.orderdishes;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.orderdishes
 * @ClassName: MenuCommand
 * @Author: lin
 * @Description: 菜单对象（宏对象）
 * @Date: 2019/8/3 15:46
 * @Version: 1.0
 */
public class MenuCommand implements Command{

    /**
     * 用来记录组合本菜单的多道菜，多个命令对象
     */
    private  List<Command> col = new ArrayList<>();

    /**
     * 将点的菜放入到菜单中
     * @param command
     */
    public  void add(Command command){col.add(command);}

    /**
     * 下单完成，通知后厨开始做菜
     */
    public  void execute(){
        // 就是循环通知后厨开始
        col.forEach((e)->e.execute());
    }

}
