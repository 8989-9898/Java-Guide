package com.ly.adaptor.pattern;

import com.ly.adaptor.LogModel;

import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.adaptor.pattern
 * @ClassName: ClassAdaptor
 * @Author: lin
 * @Description: 类适配器，是基于多继承实现的，由于java不支持多继承，
 *              所以java使用变通的方式，继承已经实现的类，在实现需要适配的接口
 *              由于使用了继承的方式，就不需要在拥有 实现类的引用了
 *              使用了继承的方式，就固定了实现的方向，使得适配器适配的方向被固定，不能在使用他的子类了
 * @Date: 2019/7/21 10:43
 * @Version: 1.0
 */
public class ClassAdaptor extends LogFileOperate implements LogDBOperateApi{
    /**
     * 判断是否传入日志文件路径和名称，没有者使用默认的日志文件
     *
     * @param logFilePathName
     */
    public ClassAdaptor(String logFilePathName) {
        super(logFilePathName);
    }

    @Override
    public void createLog(LogModel model) {

        // 首先读取日志文件
        List<LogModel> models = this.readLogFile();
        // 将日志添加
        models.add(model);
        // 将日之写入日志文件
        this.writeLogFile(models);
    }


    @Override
    public void updateLog(LogModel model) {
        // 首先读取日志文件
        List<LogModel> models = this.readLogFile();
        for (int i = 0; i < models.size(); i++) {
            if (model.getLogId().equalsIgnoreCase(models.get(i).getLogId())) {
                models.set(i, model);
                break;
            }
        }
        // 将日之写入日志文件
        this.writeLogFile(models);
    }

    @Override
    public void removeLog(LogModel model) {
        // 首先读取日志文件
        List<LogModel> models = this.readLogFile();

        models.remove(model);

        // 将日之写入日志文件
        this.writeLogFile(models);
    }

    @Override
    public List<LogModel> getAllLog() {
        return this.readLogFile();
    }
}
