package com.ly.adaptor.pattern;

import com.ly.adaptor.LogModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.adaptor.no_pattern
 * @ClassName: LogDBOperate
 * @Author: lin
 * @Description: 进行数据库日志操作（模拟数据库）
 * @Date: 2019/7/20 17:35
 * @Version: 1.0
 */
public class LogDBOperate implements LogDBOperateApi {

    // 由于代替数据库
    private List<LogModel> models = new ArrayList<>();

    @Override
    public void createLog(LogModel model) {
        this.models.add(model);
    }

    @Override
    public void updateLog(LogModel model) {
        for (int i = 0; i < this.models.size(); i++) {
            if (model.getLogId().equalsIgnoreCase(models.get(i).getLogId())) {
                models.set(i, model);
                break;
            }
        }
    }

    @Override
    public void removeLog(LogModel model) {
        this.models.remove(model);
    }

    @Override
    public List<LogModel> getAllLog() {
        return this.models;
    }
}
