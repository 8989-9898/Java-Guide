package com.ly.chain.of.responsibility.no.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.no.pattern
 * @ClassName: FeeRequest
 * @Author: lin
 * @Description: 处理聚餐费用的申请对象
 * @Date: 2019-08-16 10:44
 * @Version: 1.0
 */
public class FeeRequest {

    /**
     * 提交聚餐费用申请给项目经理
     *
     * @param user 申请人
     * @param fee  申请金额
     * @return 具体的申请结果通知
     */
    public String requestToProjectManager(String user, double fee) {
        String str = "";
        if (500 > fee) {
            // 项目经理自能批准 500 以内的聚餐费用
            str = this.projectHandler (user, fee);
        } else if (1000 > fee) {
            // 部门经理自能处理 1000 以内的聚餐费用
            str = this.deptHandler (user, fee);
        } else if (1000 <= fee) {
            // 总经理权限最大
            str = this.generalManagerHandler (user, fee);
        }
        return str;
    }

    /**
     * 项目经理的审批
     */
    private String projectHandler(String user, double fee) {
        String str = "";
        // 只同意小米的申请
        if ("小米".equals (user)) {
            str = "项目经理同意 " + user + " 的聚餐费用 " + fee + " 元的费用申请！";
        } else {
            str = "项目经理不同意 " + user + " 的聚餐费用 " + fee + " 元的费用申请！";

        }
        return str;
    }

    /**
     * 部门经理的审批
     */
    private String deptHandler(String user, double fee) {
        String str = "";
        // 只同意小米的申请
        if ("小米".equals (user)) {
            str = "部门经理同意 " + user + " 的聚餐费用 " + fee + " 元的费用申请！";
        } else {
            str = "部门经理不同意 " + user + " 的聚餐费用 " + fee + " 元的费用申请！";

        }
        return str;
    }

    /**
     * 总经理的审批
     */
    private String generalManagerHandler(String user, double fee) {
        String str = "";
        // 只同意小米的申请
        if ("小米".equals (user)) {
            str = "总经理同意 " + user + " 的聚餐费用 " + fee + " 元的费用申请！";
        } else {
            str = "总经理不同意 " + user + " 的聚餐费用 " + fee + " 元的费用申请！";

        }
        return str;
    }
}
