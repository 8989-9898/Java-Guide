package com.ly.chainofresponsibility.responsibility;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chainofresponsibility.responsibility
 * @ClassName: Handler
 * @Author: lin
 * @Description: 定义一个处理请求的接口
 * @Date: 2019-07-15 10:50
 * @Version: 1.0
 */
public abstract class Handler {
    /**
     * 在当前级别不能处理时的继承者
     */
    protected Handler successer;

    /**
     * 设置继承者
     * @param successer
     */
    public void setSuccesser(Handler successer) {
        this.successer = successer;
    }

    /**
     * 处理请求的抽象方法
     * @param request
     */
    public abstract void handlerRequest(int request);

}
