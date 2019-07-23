package com.ly.factorymethod.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.pattern
 * @ClassName: ExportFileApi
 * @Author: lin
 * @Description: 使用工厂方法模式要创建的 接口
 * @Date: 2019-07-23 16:06
 * @Version: 1.0
 */
public interface ExportFileApi {

    /**
     * 导出数据成 文件
     * @param data 要导出的数据
     * @return 成功或者失败
     */
    public boolean export(String data);
}
