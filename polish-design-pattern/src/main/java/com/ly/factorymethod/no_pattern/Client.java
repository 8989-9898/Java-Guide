package com.ly.factorymethod.no_pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.no_pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 不使用模式的客户端
 * @Date: 2019-07-23 15:50
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 在导出数据成为文件的时候，我们需要知道具体的 ExportFileApi 接口的实现对象，在不知道具体的实现对象的时候就不能进行操作
        ExportFileApi exportDB = new ExportDB();
        exportDB.export("将数据保存起来！");
    }
}
