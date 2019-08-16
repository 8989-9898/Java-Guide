package com.ly.decorator.aop;

import jdk.nashorn.internal.ir.IfNode;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.aop
 * @ClassName: CheckDecorator
 * @Author: lin
 * @Description: 实现权限认证的装饰器
 * @Date: 2019-08-16 10:00
 * @Version: 1.0
 */
public class CheckDecorator extends Decorator {
    public CheckDecorator(GoodsSaleEbi ebi) {
        super (ebi);
    }

    @Override
    public boolean sale(String user, String customer, SaleModel model) {
        // 只有王五有这个功能
        if ("王五".equals (user)) {
            // 继续调用装饰对象
            return this.ebi.sale (user, customer, model);
        }
        System.out.println ("对不起，" + user + "你没有权限操作！");
        return false;
    }
}
