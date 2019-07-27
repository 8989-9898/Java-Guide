package com.ly.builder.no_pattern;

import java.util.*;

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


        new ExportToTxt().export(header, datas, footer);

        System.out.println("=========================");
        new ExportToXml().export(header, datas, footer);

    }
}
