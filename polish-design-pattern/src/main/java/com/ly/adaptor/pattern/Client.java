package com.ly.adaptor.pattern;

import com.ly.adaptor.LogModel;
import com.ly.adaptor.adaptor.Adaptor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.adaptor.no_pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 客户端操作日志
 * @Date: 2019/7/20 17:39
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        LogModel model = new LogModel();
        model.setLogId("test");
        model.setOperateUser("张氏");
        model.setOperateTime("2019-07-20 18:13:34");
        model.setLogContent("这是一条测试的日志信息");
        List<LogModel> models=new ArrayList<>();
        models.add(model);

        // 创建新版的日志操作接口，传入日志文件操作对象，调用日志文件的接口，进行操作
        LogDBOperateApi adapter = new Adapter(new LogFileOperate(""));
        adapter.createLog(model);
        adapter.getAllLog().forEach(System.out::println);

    }
}
