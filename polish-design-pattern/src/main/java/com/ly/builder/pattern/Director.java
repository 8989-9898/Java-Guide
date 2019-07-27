package com.ly.builder.pattern;

import java.util.Collection;
import java.util.Map;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.builder.pattern
 * @ClassName: Director
 * @Author: lin
 * @Description: 文件生成的指导者
 * @Date: 2019/7/27 16:14
 * @Version: 1.0
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public String construct(ExportFooterModel footerModel, Map<String,Collection<ExportDataModel>> body, ExportHanderModel header){
        //创建文件头
        builder.builderHeader(header);
        //创建文件体
        builder.builderBody(body);
        //创建尾部
        builder.builderFooter(footerModel);
        // 返回创建的文件
        return builder.getResult();
    }
}
