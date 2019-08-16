package com.ly.decorator.aop;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.aop
 * @ClassName: GoodsSaleEbo
 * @Author: lin
 * @Description: 定义基本的业务实现对象
 * @Date: 2019-08-16 9:56
 * @Version: 1.0
 */
public class GoodsSaleEbo implements GoodsSaleEbi {
    @Override
    public boolean sale(String user, String customer, SaleModel model) {
        System.out.println (user + " 保存了 " + customer + " 购买 " + model + " 数据。");
        return true;
    }
}
