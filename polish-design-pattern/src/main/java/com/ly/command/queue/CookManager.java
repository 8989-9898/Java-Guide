package com.ly.command.queue;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.queue
 * @ClassName: CookManager
 * @Author: lin
 * @Description: 后台厨师管理类，用于启动多线程
 * @Date: 2019/8/3 16:57
 * @Version: 1.0
 */
public class CookManager {

    /**
     * 是否需要创建厨师
     */
    private static boolean runFlag = false;

    /**
     * 创建厨师，自会创建一次
     */
    public static void renManager() {
        if (!runFlag) {
            runFlag = true;
            new Thread(new HotCook("张三")).start();
            new Thread(new HotCook("李四")).start();
            new Thread(new HotCook("王五")).start();
        }
    }
}
