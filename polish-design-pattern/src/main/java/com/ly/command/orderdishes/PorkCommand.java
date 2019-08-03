package com.ly.command.orderdishes;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.orderdishes
 * @ClassName: PorkCommand
 * @Author: lin
 * @Description:
 * @Date: 2019/8/3 15:43
 * @Version: 1.0
 */
public class PorkCommand implements Command{
    /**
     * 持有厨师对象
     */
    private CookApi api;

    public void setApi(CookApi api) {
        this.api = api;
    }

    @Override
    public void execute() {
        this.api.cook("蒜泥白肉");
    }
}
