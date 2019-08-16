package com.ly.chain.of.responsibility.functional.chain;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.pattern
 * @ClassName: Handler
 * @Author: lin
 * @Description: 定义职责的接口，通常在这里定义处理请求的方法，可以在这里实现后续链
 * @Date: 2019-08-16 11:03
 * @Version: 1.0
 */
public abstract class Handler {

    /**
     * 持有后继者的职责对象
     */
    protected Handler successor;

    /**
     * 设置后继者职责对象
     * @param successor
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }


    /**
     * 保存销售信息
     * @param user 操作人
     * @param customer 客户
     * @param model 商品信息
     * @return
     */
    public abstract boolean sale(String user,String customer,SaleModel model);
}
