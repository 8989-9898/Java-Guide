package com.ly.factorymethod.no_pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.no_pattern
 * @ClassName: ExportFileApi
 * @Author: lin
 * @Description: 文件导出接口
 * @Date: 2019-07-23 15:45
 * @Version: 1.0
 */
public interface ExportFileApi {

    /**
     * 导出内容成为文件
     * @param data 需要导出的数据
     * @return 成功还是失败
     */
    public boolean export(String data);
}
