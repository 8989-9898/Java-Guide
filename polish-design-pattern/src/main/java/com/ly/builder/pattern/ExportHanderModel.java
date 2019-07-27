package com.ly.builder.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.builder.no_pattern
 * @ClassName: ExportHanderModel
 * @Author: lin
 * @Description: 导出文件的头对象
 * @Date: 2019/7/27 14:17
 * @Version: 1.0
 */
public class ExportHanderModel {

    /**
     * 分公司或门市点编号
     */
    private String depId;
    /**
     * 导出数据的日期
     */
    private String exportDate;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getExportDate() {
        return exportDate;
    }

    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }
}
