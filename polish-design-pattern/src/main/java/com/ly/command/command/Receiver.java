package com.ly.command.command;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.command
 * @ClassName: Receiver
 * @Author: lin
 * @Description: 接受者对象，真正执行命令的对象
 * @Date: 2019/8/3 9:16
 * @Version: 1.0
 */
public class Receiver {


    /**
     * 真正执行命令的相应操作
     * 如打印输出
     */
    public void action(){
        System.out.println("在 Receiver 中输出一个问候，hello");
    }

}
