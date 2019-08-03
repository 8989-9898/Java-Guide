package com.ly.command.log;


import java.io.Serializable;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.orderdishes
 * @ClassName: PorkCommand
 * @Author: lin
 * @Description:
 * @Date: 2019/8/3 15:43
 * @Version: 1.0
 */
public class PorkCommand implements Command ,Serializable {
    /**
     * 持有厨师对象
     */
    private CookApi api;

    public PorkCommand(int num) {
        this.num = num;
    }

    /**
     * 点菜的桌号
     */
    private int num;


    @Override
    public void execute() {
        this.api.cook(num,"蒜泥白肉");
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
