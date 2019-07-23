package com.ly.factorymethod.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.pattern
 * @ClassName: ExportTxtFileOperate
 * @Author: lin
 * @Description: 工厂方法的子类，创建具体的导出实现 为 TXT 格式
 * @Date: 2019-07-23 16:17
 * @Version: 1.0
 */
public class ExportTxtFileOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportTxtFile();
    }
}
