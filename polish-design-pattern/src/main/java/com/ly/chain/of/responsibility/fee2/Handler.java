package com.ly.chain.of.responsibility.fee2;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.fee
 * @ClassName: Handler
 * @Author: lin
 * @Description: 定义责任对象接口
 * @Date: 2019-08-16 11:18
 * @Version: 1.0
 */
public abstract class Handler {

    /**
     * 只有下一个处理请求的对象
     */
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 通用的请求方法
     *
     * @param model 通用的请求对象
     * @return 具体的申请结果通知
     */
    public Object handlerRequest(RequestModel model) {
        if (this.successor != null) {
            // 默认的实现，
            return this.successor.handlerRequest (model);
        }
        System.out.println ("没有后续处理或者暂时不支持这个功能");
        return false;
    }
}
