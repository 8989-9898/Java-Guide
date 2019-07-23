package com.ly.factorymethod.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.pattern
 * @ClassName: ExportOperate
 * @Author: lin
 * @Description: 创建文件导出接口的工厂方法抽象类
 * @Date: 2019-07-23 16:12
 * @Version: 1.0
 */
public abstract class ExportOperate {

    /**
     * 导出文件的方法，具体的操作是有 ExportFileApi 的实现类来完成
     * @param data
     * @return
     */
    public boolean export(String data) {
        ExportFileApi api = factoryMethod();
        // 使用钩子方法的形式调用具体的 导出实现的子类方法
        return api.export(data);
    }

    protected abstract ExportFileApi factoryMethod();

}
