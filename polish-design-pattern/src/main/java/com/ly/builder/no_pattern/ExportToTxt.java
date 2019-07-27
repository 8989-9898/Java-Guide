package com.ly.builder.no_pattern;

import java.util.Collection;
import java.util.Map;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.builder.no_pattern
 * @ClassName: BuilderTxt
 * @Author: lin
 * @Description: 导出数据成文本文件格式
 * @Date: 2019/7/27 14:51
 * @Version: 1.0
 */
public class ExportToTxt {

    /**
     * 将数据导出成为文件
     * @param hander 文件头
     * @param data 文件体
     * @param footer 文件尾
     */
    public void export(ExportHanderModel hander, Map<String,Collection<ExportDataModel>> data, ExportFooterModel footer){

        // 用来记录最终输出的文件内容
        StringBuffer buffer=new StringBuffer();
        // 拼接文件头
        buffer.append(hander.getDepId()+","+hander.getExportDate()+"\n");
        // 拼接文件体的内容
        for (String key : data.keySet()) {
            // 先拼接表名称
            buffer.append(key+"\n");
            // 循环拼接具体数据
            for (ExportDataModel model : data.get(key)) {
                buffer.append(model.getProductId()+","+model.getPrice()+","+model.getAmount()+"\n");
            }
            
        }
        // 最后拼接文件尾
        buffer.append(footer.getExportUser());

        // 将拼接的数据输出，表示保存为文件
        System.out.println(buffer);
    }

}
