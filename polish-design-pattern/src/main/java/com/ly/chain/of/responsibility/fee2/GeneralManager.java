package com.ly.chain.of.responsibility.fee2;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.fee2
 * @ClassName: ProjectManager
 * @Author: lin
 * @Description: 实现总经理处理聚餐费用的申请对象
 * @Date: 2019-08-16 13:43
 * @Version: 1.0
 */
public class GeneralManager extends Handler {

    @Override
    public Object handlerRequest(RequestModel model) {
        if (FeeRequestModel.FEE_TYPE.equals (model.getType ())) {
            return handlerFeeRequest(model);
        }else{
            // 其它的不想处理
            return super.handlerRequest (model);
        }
    }

    private Object handlerFeeRequest(RequestModel model) {
        // 先将请求类型转换回来
        FeeRequestModel fee= (FeeRequestModel) model;
        Object str = "";
        if (1000 <= fee.getFee ()) {
            // 总经理自能批准 1000 以内的聚餐费用
            // 只同意小米的申请
            if ("小米".equals (fee.getUser ())) {
                str = "总经理同意 " + fee.getUser () + " 的聚餐费用 " + fee.getFee () + " 元的费用申请！";
            } else {
                str = "总经理不同意 " + fee.getUser () + " 的聚餐费用 " + fee.getFee () + " 元的费用申请！";
            }
        } else {
            if (this.successor != null) {
                str = this.successor.handlerRequest (model);
            }
        }
        return str;
    }
}
