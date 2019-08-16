package com.ly.decorator.aop;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.aop
 * @ClassName: GoodsSaleEbi
 * @Author: lin
 * @Description: 商品销售管理的业务接口
 * @Date: 2019-08-16 9:52
 * @Version: 1.0
 */
public interface GoodsSaleEbi {

    /**
     * 保存销售信息
     * @param user 操作人员
     * @param customer 客户
     * @param model 销售数据
     * @return 是否成功
     */
    boolean sale(String user,String customer,SaleModel model);
}
