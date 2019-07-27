package com.ly.builder.no_pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.builder.no_pattern
 * @ClassName: ExportDataModel
 * @Author: lin
 * @Description: 描述输出数据的对象
 * @Date: 2019/7/27 14:47
 * @Version: 1.0
 */
public class ExportDataModel {

    /**
     * 产品编号
     */
    private String productId;
    /**
     * 金额
     */
    private double price;
    /**
     * 数量
     */
    private double amount;

    public ExportDataModel(String productId, double price, double amount) {
        this.productId = productId;
        this.price = price;
        this.amount = amount;
    }

    public ExportDataModel() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
