package com.ly.chain.of.responsibility.functional.chain;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.aop
 * @ClassName: SaleModel
 * @Author: lin
 * @Description: 封装的销售信息
 * @Date: 2019-08-16 9:54
 * @Version: 1.0
 */
public class SaleModel {

    /**
     * 商品
     */
    private String goods;

    /**
     * 数量
     */
    private int saleNum;


    @Override
    public String toString() {
        return "商品名称：" + goods + ", 购买数量=" + saleNum;
    }

    public SaleModel() {
    }

    public SaleModel(String goods, int saleNum) {
        this.goods = goods;
        this.saleNum = saleNum;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }
}
