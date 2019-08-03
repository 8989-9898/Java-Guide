package com.ly.command.queue;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.orderdishes
 * @ClassName: DuckCommand
 * @Author: lin
 * @Description: 北京烤鸭
 * @Date: 2019/8/3 15:43
 * @Version: 1.0
 */
public class DuckCommand implements Command{

    /**
     * 持有厨师对象
     */
    private CookApi api;

    public DuckCommand(int num) {
        this.num = num;
    }

    /**
     * 点菜的桌号
     */
    private int num;


    @Override
    public void execute() {
        this.api.cook(num,"北京烤鸭");
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
