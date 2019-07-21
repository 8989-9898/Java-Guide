package com.ly.adaptor.no_pattern;

import com.ly.adaptor.LogModel;

import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.adaptor.no_pattern
 * @ClassName: LogFileOperateApi
 * @Author: lin
 * @Description: 日志文件管理第一版，日志文件管理接口
 * @Date: 2019/7/20 16:08
 * @Version: 1.0
 */
public interface LogFileOperateApi {
    /**
     * 将日志从日志文件中读取出来
     * @return
     */
    public List<LogModel> readLogFile();

    /**
     * 将日志写入日志文件中
     * @param list
     */
    public void writeLogFile(List<LogModel> list);

}
