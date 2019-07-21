package com.ly.adaptor.pattern;

import com.ly.adaptor.LogModel;

import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.adaptor.pattern
 * @ClassName: Adapter
 * @Author: lin
 * @Description: 适配器，将记录日志到文件的功能适配成为第二版需要的增删改查
 * @Date: 2019/7/20 18:07
 * @Version: 1.0
 */
public class Adapter implements LogDBOperateApi {

    private LogFileOperateApi adaptee;

    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void createLog(LogModel model) {

        // 首先读取日志文件
        List<LogModel> models = adaptee.readLogFile();
        // 将日志添加
        models.add(model);
        // 将日之写入日志文件
        adaptee.writeLogFile(models);
    }


    @Override
    public void updateLog(LogModel model) {
        // 首先读取日志文件
        List<LogModel> models = adaptee.readLogFile();
        for (int i = 0; i < models.size(); i++) {
            if (model.getLogId().equalsIgnoreCase(models.get(i).getLogId())) {
                models.set(i, model);
                break;
            }
        }
        // 将日之写入日志文件
        adaptee.writeLogFile(models);
    }

    @Override
    public void removeLog(LogModel model) {
        // 首先读取日志文件
        List<LogModel> models = adaptee.readLogFile();

        models.remove(model);

        // 将日之写入日志文件
        adaptee.writeLogFile(models);
    }

    @Override
    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }
}
