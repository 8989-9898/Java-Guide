package com.ly.chain.of.responsibility.functional.chain;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.functional.chain
 * @ClassName: SaleDataCheck
 * @Author: lin
 * @Description: 对数据进行验证
 * @Date: 2019-08-16 14:24
 * @Version: 1.0
 */
public class SaleDataCheck extends Handler {
    @Override
    public boolean sale(String user, String customer, SaleModel model) {
        if (user == null || user.trim ().length () == 0) {
            System.out.println ("操作人员不能空");
            return false;
        }
        if (customer == null || customer.trim ().length () == 0) {
            System.out.println ("客户不能空");
            return false;
        }
        if (model == null) {
            System.out.println ("商品信息不能空");
            return false;
        }
        if (model.getGoods () == null || model.getGoods ().trim ().length () == 0) {
            System.out.println ("商品名称不能为空");
            return false;
        }
        if (model.getSaleNum () <= 0) {
            System.out.println ("商品数量不能为0");
            return false;
        }
        return this.successor.sale (user, customer, model);
    }
}
