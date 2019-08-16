package com.ly.chain.of.responsibility.functional.chain;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.functional.chain
 * @ClassName: SaleLogicCheck
 * @Author: lin
 * @Description: 进行数据逻辑检查
 * @Date: 2019-08-16 14:28
 * @Version: 1.0
 */
public class SaleLogicCheck extends Handler{

    @Override
    public boolean sale(String user, String customer, SaleModel model) {
        // 检查 id 唯一，主外键对应关系
        // 直接通过
        return this.successor.sale (user,customer,model);
    }
}
