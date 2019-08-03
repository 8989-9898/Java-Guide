package com.ly.command.degeneration2;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.degeneration
 * @ClassName: Invoker
 * @Author: lin
 * @Description: 持有者
 * @Date: 2019/8/3 17:43
 * @Version: 1.0
 */
public class Invoker {

    /**
     * 开始打印
     */
    public void startPrint(Command command){
        System.out.println("使用 回调的方式调用命令");
        // 执行命令
        command.execute();
    }
}
