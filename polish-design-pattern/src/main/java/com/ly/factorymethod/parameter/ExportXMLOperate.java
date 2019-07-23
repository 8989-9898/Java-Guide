package com.ly.factorymethod.parameter;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.parameter
 * @ClassName: ExportXMLOperate
 * @Author: lin
 * @Description: 继承工厂方法重写创建 对象的工厂方法
 * @Date: 2019-07-23 16:53
 * @Version: 1.0
 */
public class ExportXMLOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod(int type) {
        ExportFileApi api = null;
        // 也可以全部覆盖，只创建自己所需的实现不管其它的创建
        if (type == 3) {
            api = new ExportXMLFile();
        } else {
            // 在不需要 XML 格式的时候使用父类来创建其它的格式
            api = super.factoryMethod(type);
        }
        return api;
    }
}
