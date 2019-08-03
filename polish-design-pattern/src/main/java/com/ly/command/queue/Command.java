package com.ly.command.queue;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.queue
 * @ClassName: Command
 * @Author: lin
 * @Description: 命令接口
 * @Date: 2019/8/3 16:23
 * @Version: 1.0
 */
public interface Command {

    /**
     * 执行相应的操作
     */
    public void execute();

    /**
     * 设置命令的接受者
     *
     * @param api
     */
    public void setCookApi(CookApi api);

    /**
     * 获取桌号
     *
     * @return
     */
    public int getTableNum();
}
