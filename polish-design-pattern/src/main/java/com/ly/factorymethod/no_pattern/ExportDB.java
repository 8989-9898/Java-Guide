package com.ly.factorymethod.no_pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.no_pattern
 * @ClassName: ExportDB
 * @Author: lin
 * @Description: 将数据导出成 sql 文件的实现类
 * @Date: 2019-07-23 15:49
 * @Version: 1.0
 */
public class ExportDB implements ExportFileApi {


    @Override
    public boolean export(String data) {
        System.out.println("将数据导出保存为 SQL 文件：" + data);
        return true;
    }
}
