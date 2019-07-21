package com.ly.adaptor.no_pattern;

import com.ly.adaptor.LogModel;

import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.adaptor.no_pattern
 * @ClassName: LogDBOperateApi
 * @Author: lin
 * @Description: 由于第二版的功能需求，需要将日志文件改为数据库记录日志的方式
 * @Date: 2019/7/20 17:30
 * @Version: 1.0
 */
public interface LogDBOperateApi {

    /**
     * 添加日志信息
     * @param model
     */
    void createLog(LogModel model);

    /**
     * 修改指定的日志信息
     * @param model
     */
    void updateLog(LogModel model);

    /**
     * 删除指定的日志信息
     * @param model
     */
    void removeLog(LogModel model);

    /**
     * 获取所有日志信息
     * @return
     */
    List<LogModel> getAllLog();

}
