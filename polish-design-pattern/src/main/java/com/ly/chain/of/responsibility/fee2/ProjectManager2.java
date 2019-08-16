package com.ly.chain.of.responsibility.fee2;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.fee2
 * @ClassName: ProjectManager
 * @Author: lin
 * @Description: 实现项目经理处理差旅费用的申请对象
 * @Date: 2019-08-16 13:43
 * @Version: 1.0
 */
public class ProjectManager2 extends ProjectManager {

    @Override
    public Object handlerRequest(RequestModel model) {
        if (PreFeeRequestModel.PRE_FEE_TYPE.equals (model.getType ())) {
            return handlerPreFeeRequest (model);
        } else {
            // 其它的不想处理
            return super.handlerRequest (model);
        }
    }

    private Object handlerPreFeeRequest(RequestModel model) {
        // 先将请求类型转换回来
        PreFeeRequestModel fee = (PreFeeRequestModel) model;
        Object str = "";
        if (5000 > fee.getPreFee ()) {
            // 项目经理自能批准 5000 以内的差旅费用
            // 只同意小米的申请
            str = "项目经理同意 " + fee.getUser () + " 预支的差旅费用 " + fee.getPreFee () + " 元的费用申请！";
        } else {
            if (this.successor != null) {
                str = this.successor.handlerRequest (model);
            }
        }
        return str;
    }
}
