package com.ly.factorymethod.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.pattern
 * @ClassName: ExportTxtFile
 * @Author: lin
 * @Description: 将数据导出成 txt 文件的实现类
 * @Date: 2019-07-23 16:07
 * @Version: 1.0
 */
public class ExportTxtFile implements ExportFileApi{

    @Override
    public boolean export(String data) {
        System.out.println("将数据"+data+"导出成为 txt 文件!");
        return true;
    }
}
