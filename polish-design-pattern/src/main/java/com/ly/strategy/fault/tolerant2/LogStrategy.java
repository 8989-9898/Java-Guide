package com.ly.strategy.fault.tolerant2;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.fault.tolerant
 * @ClassName: LogStrategy
 * @Author: lin
 * @Description: 日志记录接口
 * @Date: 2019/8/7 21:19
 * @Version: 1.0
 */
public interface LogStrategy {
    /**
     * 记录日志
     * @param msg 日志信息
     */
    public void log(String msg);
}
