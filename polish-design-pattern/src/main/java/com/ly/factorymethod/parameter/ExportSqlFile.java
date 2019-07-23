package com.ly.factorymethod.parameter;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.pattern
 * @ClassName: ExportSqlFile
 * @Author: lin
 * @Description: 将数据导出成为 SQL 文件的实现子类
 * @Date: 2019-07-23 16:10
 * @Version: 1.0
 */
public class ExportSqlFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("将数据："+data+" 导出成为 SQL 文件！");
        return true;
    }
}
