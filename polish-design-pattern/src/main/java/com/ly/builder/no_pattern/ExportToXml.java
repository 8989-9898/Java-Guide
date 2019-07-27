package com.ly.builder.no_pattern;

import java.util.Collection;
import java.util.Map;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.builder.no_pattern
 * @ClassName: BuilderXml
 * @Author: lin
 * @Description: 将数据导出成 XML 格式
 * @Date: 2019/7/27 15:03
 * @Version: 1.0
 */
public class ExportToXml {

    /**
     * 将数据导出成为XML文件
     * @param hander 文件头
     * @param data 文件体
     * @param footer 文件尾
     */
    public void export(ExportHanderModel hander, Map<String,Collection<ExportDataModel>> data, ExportFooterModel footer){

        // 用来记录最终输出的文件内容
        StringBuffer buffer=new StringBuffer();
        // 拼接文件头
        buffer.append("<?xml version='1.0' encoding='utf-8'?>\n");
        buffer.append("<Report>\n");
        buffer.append(" <Header>\n");
        buffer.append("     <DepId>"+hander.getDepId()+"</DepId>\n");
        buffer.append("     <ExportDate>"+hander.getExportDate()+"</ExportDate>\n");
        buffer.append(" </Header>\n");
        buffer.append(" </Body>\n");
        // 拼接文件体的内容
        for (String key : data.keySet()) {
            // 先拼接表名称
            buffer.append("     <Datas TableName=\""+key+"\">\n");
            // 循环拼接具体数据
            for (ExportDataModel model : data.get(key)) {
                buffer.append("         <ProductId>"+model.getProductId()+"</ProductId>\n");
                buffer.append("         <Price>"+model.getPrice()+"</Price>\n");
                buffer.append("         <Amount>"+model.getAmount()+"</Amount>\n");
            }
            buffer.append("     </Datas>\n");

        }
        buffer.append(" </Body>\n");
        // 最后拼接文件尾
        buffer.append(" <Footer>\n");
        buffer.append("     <ExportUser>"+footer.getExportUser()+"</ExportUser>\n");
        buffer.append(" </Footer>\n");
        buffer.append("</Report>\n");

        // 将拼接的数据输出，表示保存为文件
        System.out.println(buffer);

    }

}
