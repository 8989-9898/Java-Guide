package com.ly.builder.pattern;


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
public class BuilderTxt implements Builder {
    // 用来记录最终输出的文件内容
    private StringBuffer buffer = new StringBuffer();


    @Override
    public void builderHeader(ExportHanderModel header) {
        // 拼接文件头
        buffer.append(header.getDepId() + "," + header.getExportDate() + "\n");
    }

    @Override
    public void builderBody(Map<String, Collection<ExportDataModel>> body) {
        // 拼接文件体的内容
        for (String key : body.keySet()) {
            // 先拼接表名称
            buffer.append(key + "\n");
            // 循环拼接具体数据
            for (ExportDataModel model : body.get(key)) {
                buffer.append(model.getProductId() + "," + model.getPrice() + "," + model.getAmount() + "\n");
            }

        }
    }

    @Override
    public void builderFooter(ExportFooterModel footer) {
        // 最后拼接文件尾
        buffer.append(footer.getExportUser());
    }

    @Override
    public String getResult() {
        return buffer.toString();
    }
}
