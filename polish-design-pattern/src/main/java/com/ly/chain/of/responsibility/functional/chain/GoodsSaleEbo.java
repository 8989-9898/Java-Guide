package com.ly.chain.of.responsibility.functional.chain;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.functional.chain
 * @ClassName: GoodsSaleEbo
 * @Author: lin
 * @Description: 商品管理模块的业务处理
 * @Date: 2019-08-16 14:14
 * @Version: 1.0
 */
public class GoodsSaleEbo {

    /**
     * 保存销售信息
     * @param user 操作人
     * @param customer 客户
     * @param model 商品信息
     * @return
     */
    public boolean sale(String user,String customer,SaleModel model){
        // 1、权限检查
        // 2、参数验证
        // 3、数据逻辑验证
        // 4、执行真正的业务处理

        // 开始组装功能链，由每个功能链处理各自的功能
        Handler securityCheck = new SaleSecurityCheck ();
        Handler dataCheck=new SaleDataCheck ();
        Handler logicCheck=new SaleLogicCheck ();
        Handler mgr=new SaleMgr ();

        securityCheck.setSuccessor (dataCheck);
        dataCheck.setSuccessor (logicCheck);
        logicCheck.setSuccessor (mgr);

        return securityCheck.sale (user,customer,model);
    }
}
