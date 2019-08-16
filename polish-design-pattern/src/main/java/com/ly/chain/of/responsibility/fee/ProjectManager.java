package com.ly.chain.of.responsibility.fee;

import com.ly.chain.of.responsibility.fee.Handler;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.no.pattern
 * @ClassName: ProjectManager
 * @Author: lin
 * @Description: 项目经理的聚餐费用处理
 * @Date: 2019-08-16 11:20
 * @Version: 1.0
 */
public class ProjectManager extends Handler {
    @Override
    public String handlerFeeRequest(String user, double fee) {
        String str = "";
        if (500 > fee) {
            // 项目经理自能批准 500 以内的聚餐费用
            // 只同意小米的申请
            if ("小米".equals (user)) {
                str = "项目经理同意 " + user + " 的聚餐费用 " + fee + " 元的费用申请！";
            } else {
                str = "项目经理不同意 " + user + " 的聚餐费用 " + fee + " 元的费用申请！";
            }
        } else {
            if (this.successor != null) {
                str = this.successor.handlerFeeRequest (user, fee);
            }
        }
        return str;
    }

    @Override
    public boolean handlerPreFeeRequest(String user, double fee) {
        if (5000 > fee) {
            // 项目经理只能同意 5000 以内的
            System.out.println ("项目经理同意 " + user + " 预支差旅费用 " + fee + " 元的请求！");
            return true;
        } else {
            // 超过传给他人处理
            if (this.successor != null) {
                return this.successor.handlerPreFeeRequest (user, fee);
            }
        }
        return false;
    }
}
