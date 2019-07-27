package com.ly.builder.pattern;


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
public class BuilderXml implements Builder{

    private StringBuffer buffer=new StringBuffer();


    @Override
    public void builderHeader(ExportHanderModel header) {
        // 拼接文件头
        buffer.append("<?xml version='1.0' encoding='utf-8'?>\n");
        buffer.append("<Report>\n");
        buffer.append(" <Header>\n");
        buffer.append("     <DepId>"+header.getDepId()+"</DepId>\n");
        buffer.append("     <ExportDate>"+header.getExportDate()+"</ExportDate>\n");
        buffer.append(" </Header>\n");
    }

    @Override
    public void builderBody(Map<String,Collection<ExportDataModel>> body) {
        buffer.append(" </Body>\n");
        // 拼接文件体的内容
        for (String key : body.keySet()) {
            // 先拼接表名称
            buffer.append("     <Datas TableName=\""+key+"\">\n");
            // 循环拼接具体数据
            for (ExportDataModel model : body.get(key)) {
                buffer.append("         <ProductId>"+model.getProductId()+"</ProductId>\n");
                buffer.append("         <Amount>"+model.getAmount()+"</Amount>\n");
                buffer.append("         <Price>"+model.getPrice()+"</Price>\n");
            }
            buffer.append("     </Datas>\n");
        }
        buffer.append(" </Body>\n");
    }

    @Override
    public void builderFooter(ExportFooterModel footer) {
// 最后拼接文件尾
        buffer.append(" <Footer>\n");
        buffer.append("     <ExportUser>"+footer.getExportUser()+"</ExportUser>\n");
        buffer.append(" </Footer>\n");
        buffer.append("</Report>\n");
    }

    @Override
    public String getResult() {
        return buffer.toString();
    }
}
