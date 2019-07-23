package com.ly.factorymethod.parameter;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.parameter
 * @ClassName: Client
 * @Author: lin
 * @Description: 参数化工厂方法的示例
 * @Date: 2019-07-23 16:44
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        ExportOperate operate = new ExportOperate();
        operate.export(2,"测试数据");

        // 如果添加了新的导出方式只需要继承 ExportOperate 类即可，如添加 XML 方式
        operate = new ExportXMLOperate();
        operate.export(2,"测试数据");
        operate.export(3,"测试数据");
        operate.export(1,"测试数据");
    }
}
