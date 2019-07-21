package com.ly.adaptor.pattern;

import com.ly.adaptor.LogModel;
import org.w3c.dom.html.HTMLModElement;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.adaptor.pattern
 * @ClassName: TwoWayClient
 * @Author: lin
 * @Description: 使用双向适配器的客户端
 * @Date: 2019/7/21 10:22
 * @Version: 1.0
 */
public class TwoWayClient {
    public static void main(String[] args) {
        LogDBOperateApi dbOperate = new LogDBOperate();
        LogFileOperateApi fileOperate = new LogFileOperate("");
        TwoWayAdapter wayAdapter = new TwoWayAdapter(fileOperate, dbOperate);
        LogModel model = new LogModel();
        model.setLogId("twoWayAdaptor");
        model.setOperateUser("lisi");
        model.setOperateTime("2019-07-21 10:29:30");
        model.setLogContent("使用双向适配器测试信息");
        List<LogModel> list=new ArrayList<>();
        list.add(model);
        // 实际调用的是数据库的接口进行存储
        wayAdapter.writeLogFile(list);
        // 实际调用的是日志文件的接口读取文件信息
        wayAdapter.getAllLog().forEach(System.out::println);
        // 实际调用的是数据库的接口读取日志信息
        wayAdapter.readLogFile().forEach(System.out::println);
    }
}
