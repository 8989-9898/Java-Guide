package com.ly.builder.pattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.builder.no_pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: ${DESCRIPTION}
 * @Date: 2019/7/27 15:13
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 添加测试数据
        ExportHanderModel header = new ExportHanderModel();
        header.setDepId("淘宝");
        header.setExportDate("2019-07-27 15:20:30");

        Map<String, Collection<ExportDataModel>> datas = new HashMap<>();
        Collection<ExportDataModel> bodys = new ArrayList<>();
        bodys.add(new ExportDataModel("03", 90, 40));
        bodys.add(new ExportDataModel("04", 40, 50));
        datas.put("抢购订单表", bodys);

        ExportFooterModel footer = new ExportFooterModel();
        footer.setExportUser("李四");

        Builder txt = new BuilderTxt();
        Director director=new Director(txt);
        System.out.println(director.construct(footer,datas,header));
        System.out.println("=========================");

        director=new Director(new BuilderXml());
        System.out.println(director.construct(footer,datas,header));

    }
}
