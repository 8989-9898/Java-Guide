package com.ly.adaptor.no_pattern;

import com.ly.adaptor.LogModel;

import java.lang.management.OperatingSystemMXBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.adaptor.no_pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 第一版客户端操作日志
 * @Date: 2019/7/20 17:39
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        LogModel model = new LogModel();
        model.setLogId("test");
        model.setOperateUser("张氏");
        model.setOperateTime("2019-07-20 17:40:34");
        model.setLogContent("这是一条测试的日志信息");
        List<LogModel> models=new ArrayList<>();
        models.add(model);
        LogFileOperate fileOperate = new LogFileOperate("");
        fileOperate.writeLogFile(models);
        fileOperate.readLogFile().forEach(System.out::println);

        // 第二版、现在将日志管理转换为数据库的存储
        model.setLogId("test");
        model.setOperateUser("张氏");
        model.setOperateTime("2019-07-20 17:40:34");
        model.setLogContent("DB这是一条测试的日志信息");

        LogDBOperateApi dbOperate = new LogDBOperate();
        dbOperate.createLog(model);
        dbOperate.getAllLog().forEach(System.out::println);

        /* 现在由于第二版使用的是数据库管理，而第一版使用的是日志文件的管理，需要将两种方式结合而又不能修改第一版的
         * 代码，第二版的客户端不能像以前那样调用第一版的日志文件管理，这就意味者想要同时支持两种方式，需要额外的做一些工作
         * 才可以让第一版的实现适应新的业务（适配器模式）*/
    }
}
