package com.ly.factorymethod.parameter;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.pattern
 * @ClassName: ExportOperate
 * @Author: lin
 * @Description: 创建文件导出接口的工厂方法抽象类
 * @Date: 2019-07-23 16:12
 * @Version: 1.0
 */
public class ExportOperate {

    /**
     * 导出文件的方法，具体的操作是有 ExportFileApi 的实现类来完成
     *
     * @param data
     * @return
     */
    public boolean export(int type, String data) {
        ExportFileApi api = factoryMethod(type);
        // 使用钩子方法的形式调用具体的 导出实现的子类方法
        return api.export(data);
    }

    /**
     * 使用参数化的工厂方法 ，根据具体的参数创建具体的实现
     * @param type
     * @return
     */
    protected ExportFileApi factoryMethod(int type) {
        ExportFileApi api = null;
        if (type == 1) {
            api = new ExportTxtFile();
        } else if (type == 2) {
            api = new ExportSqlFile();
        }
        return api;
    }

}
