package com.ly.adaptor.pattern;

import com.ly.adaptor.LogModel;

import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.adaptor.pattern
 * @ClassName: TwoWayAdapter
 * @Author: lin
 * @Description: 双向适配器,同时实现了Target 和 Adaptee 的接口，使得双向适配器
 *               可以在 Target或Adaptee 使用的地方使用，提高了灵活性和对客户的透明性
 * @Date: 2019/7/21 10:11
 * @Version: 1.0
 */
public class TwoWayAdapter implements LogDBOperateApi, LogFileOperateApi {

    // 持有双像适配的对象
    private LogFileOperateApi fileApi;
    private LogDBOperateApi dbApi;

    public TwoWayAdapter(LogFileOperateApi fileApi, LogDBOperateApi dbApi) {
        this.fileApi = fileApi;
        this.dbApi = dbApi;
    }


    /* 一下是将文件操作的方式适配为DB实现方式的接口 */

    @Override
    public void createLog(LogModel model) {
        List<LogModel> models = fileApi.readLogFile();

        models.add(model);

        fileApi.writeLogFile(models);
    }

    @Override
    public void updateLog(LogModel model) {
        List<LogModel> models = fileApi.readLogFile();

        for (int i = 0; i < models.size(); i++) {
            if (model.getLogId().equalsIgnoreCase(models.get(i).getLogId())) {
                models.set(i, model);
                break;
            }
        }
        fileApi.writeLogFile(models);
    }

    @Override
    public void removeLog(LogModel model) {
        List<LogModel> models = fileApi.readLogFile();
        models.remove(model);
        fileApi.writeLogFile(models);
    }

    @Override
    public List<LogModel> getAllLog() {
        return fileApi.readLogFile();
    }

    /* 以下是将DB操作的方式适配为文件操作的方式*/

    @Override
    public List<LogModel> readLogFile() {
        return dbApi.getAllLog();
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        // 在执行该操作之前，因该进行日志文件的判断，防止添加重复的日志文件
        // 将文件中的日志循环存入数据库中
        list.forEach((e) ->
            dbApi.createLog(e)
        );
    }
}
