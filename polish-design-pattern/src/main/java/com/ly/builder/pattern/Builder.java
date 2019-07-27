package com.ly.builder.pattern;

import java.util.Collection;
import java.util.Map;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.builder.pattern
 * @ClassName: Builder
 * @Author: lin
 * @Description: 定义一个生成器接口，定义创建一个输出文件对象所需的操作
 * @Date: 2019/7/27 16:02
 * @Version: 1.0
 */
public interface Builder {

    public void builderHeader(ExportHanderModel header);

    public void builderBody(Map<String,Collection<ExportDataModel>> body);

    public void builderFooter(ExportFooterModel footer);

    public String getResult();
}
