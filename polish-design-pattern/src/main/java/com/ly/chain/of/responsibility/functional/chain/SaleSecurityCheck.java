package com.ly.chain.of.responsibility.functional.chain;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.functional.chain
 * @ClassName: SaleSecurityCheck
 * @Author: lin
 * @Description: 实现安全检查的链
 * @Date: 2019-08-16 14:22
 * @Version: 1.0
 */
public class SaleSecurityCheck extends Handler {
    @Override
    public boolean sale(String user, String customer, SaleModel model) {
        // 只有王五有这个功能
        if ("王五".equals (user)) {
            // 继续调用装饰对象
            return this.successor.sale (user, customer, model);
        }
        System.out.println ("对不起，" + user + "你没有权限操作！");
        return false;
    }
}
