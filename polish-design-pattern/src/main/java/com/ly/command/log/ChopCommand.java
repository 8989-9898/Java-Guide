package com.ly.command.log;

import java.io.Serializable;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.orderdishes
 * @ClassName: ChopCommand
 * @Author: lin
 * @Description: 具体的命令对象，绿豆排骨煲
 * @Date: 2019/8/3 15:39
 * @Version: 1.0
 */
public class ChopCommand implements Command ,Serializable {


    /**
     * 持有厨师对象
     */
    private CookApi api;

    public ChopCommand(int num) {
        this.num = num;
    }

    /**
     * 点菜的桌号
     */
    private int num;


    @Override
    public void execute() {
        this.api.cook(num,"绿豆排骨煲");
    }

    @Override
    public void setCookApi(CookApi api) {
        this.api = api;
    }

    @Override
    public int getTableNum() {
        return num;
    }
}
