package com.ly.chain.of.responsibility.fee;

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
     * 提交聚餐费用申请
     *
     * @param user 申请人
     * @param fee  申请金额
     * @return 具体的申请结果通知
     */
    public abstract String handlerFeeRequest(String user,double fee);


    /**
     * 申请差旅费
     * @param user 申请人
     * @param fee 申请金额
     * @return 具体的申请结果通知
     */
    public abstract boolean handlerPreFeeRequest(String user,double fee);
}
