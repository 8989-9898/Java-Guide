package com.ly.strategy.fault.tolerant2;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.fault.tolerant
 * @ClassName: DBLog
 * @Author: lin
 * @Description: 文件日志
 * @Date: 2019/8/7 21:20
 * @Version: 1.0
 */
public class FileLog extends LogStrategyTemplate {
    @Override
    public void dolog(String msg) {

        System.out.println("现在把日志信息： "+msg+" 加入到文件中");
    }
}
