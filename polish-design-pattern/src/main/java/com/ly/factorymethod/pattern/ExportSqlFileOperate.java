package com.ly.factorymethod.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.pattern
 * @ClassName: ExportSqlFileOperate
 * @Author: lin
 * @Description: 工厂方法的子类，创建具体的导出实现为 SQL 格式的子类
 * @Date: 2019-07-23 16:18
 * @Version: 1.0
 */
public class ExportSqlFileOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportSqlFile();
    }
}
