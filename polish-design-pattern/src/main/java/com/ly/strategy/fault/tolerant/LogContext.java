package com.ly.strategy.fault.tolerant;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.fault.tolerant
 * @ClassName: LogContext
 * @Author: lin
 * @Description: 日志上下文对象
 * @Date: 2019/8/7 21:24
 * @Version: 1.0
 */
public class LogContext {

    public void log(String msg){
        // 在上下文中，自行实现对具体策略的选择
        // 优先使用数据库进行日志存储
        LogStrategy dbLog = new DBLog();
        try {
            dbLog.log(msg);
        } catch (Exception e) {
            // 出错了，记录到文件中
            FileLog fileLog = new FileLog();
            fileLog.log(msg);
        }
    }
}
