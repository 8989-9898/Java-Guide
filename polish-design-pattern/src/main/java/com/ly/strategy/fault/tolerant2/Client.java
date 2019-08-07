package com.ly.strategy.fault.tolerant2;

import com.ly.strategy.fault.tolerant.LogContext;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.fault.tolerant2
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用策略模式和模板方法模式结合的方式实现日志容错恢复
 * @Date: 2019/8/7 21:30
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        LogContext context = new LogContext();
        context.log("测试日志");
        context.log("测试日志记录");
    }
}
