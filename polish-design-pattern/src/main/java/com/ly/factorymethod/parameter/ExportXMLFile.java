package com.ly.factorymethod.parameter;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.parameter
 * @ClassName: ExportXMLFile
 * @Author: lin
 * @Description: 将数据导出成为 XML 文件
 * @Date: 2019-07-23 16:50
 * @Version: 1.0
 */
public class ExportXMLFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("将数据："+data+" 导出成 XML 文件保存");
        return true;
    }
}
