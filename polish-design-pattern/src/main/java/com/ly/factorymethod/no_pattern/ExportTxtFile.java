package com.ly.factorymethod.no_pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.no_pattern
 * @ClassName: ExportTxtFile
 * @Author: lin
 * @Description: 将数据导出成txt文件的实现
 * @Date: 2019-07-23 15:47
 * @Version: 1.0
 */
public class ExportTxtFile implements ExportFileApi {


    @Override
    public boolean export(String data) {
        System.out.println("将数据导出保存为 txt 文件："+data);
        return true;
    }
}
