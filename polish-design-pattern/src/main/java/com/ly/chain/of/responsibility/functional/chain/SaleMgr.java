package com.ly.chain.of.responsibility.functional.chain;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.functional.chain
 * @ClassName: SaleMgr
 * @Author: lin
 * @Description: 执行真正的保存
 * @Date: 2019-08-16 14:42
 * @Version: 1.0
 */
public class SaleMgr extends Handler {
    @Override
    public boolean sale(String user, String customer, SaleModel model) {
        System.out.println (user + " 保存了 " + customer + " 购买 " + model + " 数据。");
        return true;
    }
}
