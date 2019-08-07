package com.ly.strategy.fault.tolerant;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.fault.tolerant
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用策略模式实现容错恢复机制
 * @Date: 2019/8/7 21:27
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        LogContext context = new LogContext();
        context.log("测试日志");
        context.log("测试日志记录");
    }
}
