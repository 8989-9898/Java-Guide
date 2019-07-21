package com.ly.adaptor;

import java.io.Serializable;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.adaptor
 * @ClassName: LogModel
 * @Author: lin
 * @Description: 日志模型类
 * @Date: 2019/7/20 16:05
 * @Version: 1.0
 */
public class LogModel implements Serializable {
    /**
     * 日志id
     */
    private String logId;
    /**
     * 操作人员
     */
    private String operateUser;
    /**
     * 操作时间：格式 yyyy-MM-dd HH:mm:ss
     */
    private String operateTime;
    /**
     * 日志内容
     */
    private String logContent;



    @Override
    public String toString() {
        return "LogModel{" +
                "logId='" + logId + '\'' +
                ", operateUser='" + operateUser + '\'' +
                ", operateTime='" + operateTime + '\'' +
                ", logContent='" + logContent + '\'' +
                '}';
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }
}
