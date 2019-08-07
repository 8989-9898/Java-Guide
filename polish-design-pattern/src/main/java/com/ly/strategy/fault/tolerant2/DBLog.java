package com.ly.strategy.fault.tolerant2;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.fault.tolerant
 * @ClassName: DBLog
 * @Author: lin
 * @Description: 将日志记录到数据库中，在添加时手动抛出异常，在上下文对象中使用文件日志进行容错处理
 * @Date: 2019/8/7 21:20
 * @Version: 1.0
 */
public class DBLog extends LogStrategyTemplate {
    @Override
    public void dolog(String msg) {
        if (msg!=null&& msg.trim().length()>5) {
            int a=5/0;
        }
        System.out.println("现在把日志信息： "+msg+" 加入到数据库中");
    }
}
