package com.ly.strategy.fault.tolerant2;

import com.sun.deploy.security.MSCryptoDSASignature;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.fault.tolerant2
 * @ClassName: LogStrategyTemplate
 * @Author: lin
 * @Description: 实现日志策略的抽象模板，实现为消息添加时间
 * @Date: 2019/8/7 21:33
 * @Version: 1.0
 */
public abstract class LogStrategyTemplate implements LogStrategy {
    @Override
    public void log(String msg) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        msg=format.format(new Date())+" 内容是："+msg;
    }

    public abstract void dolog(String msg);
}
