package com.ly.command.orderdishes;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.orderdishes
 * @ClassName: ChopCommand
 * @Author: lin
 * @Description: 具体的命令对象，绿豆排骨煲
 * @Date: 2019/8/3 15:39
 * @Version: 1.0
 */
public class ChopCommand implements Command {

    /**
     * 持有厨师对象
     */
    private CookApi api;

    public void setApi(CookApi api) {
        this.api = api;
    }

    @Override
    public void execute() {
        this.api.cook("绿豆排骨煲");
    }
}
