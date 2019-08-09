package com.ly.state.leave;

import java.util.Scanner;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.leave
 * @ClassName: ProjectManagerState
 * @Author: lin
 * @Description: 处理项目经理的审核，处理好对应部门经理的审核或是审核结束这两种状态的一种
 * @Date: 2019-08-09 10:26
 * @Version: 1.0
 */
public class ProjectManagerState implements State {
    @Override
    public void doWork(StateMachine machine) {
        // 首先获取请假单的数据模型
        LeaveRequestModel vo = (LeaveRequestModel) machine.getBusinessVO ();
        System.out.println ("项目经理审核中，请稍后.......");
        System.out.println (vo.getUser () + " 申请从 " + vo.getBeginDate () + " 开始请假 " + vo.getLeaveDays () + " 天，项目经理审核（1、同意  2、不同意）");
        Scanner scanner = new Scanner (System.in);
        if (scanner.hasNext ()) {
            String result = "不同意";
            if (scanner.nextInt () == 1) {
                result = "同意";
                if (vo.getLeaveDays () > 3) {
                    // 大于 3 天项目经理不能做主，交由部门经理审核
                    machine.setState (new DeptManagerState ());
                } else {
                    // 小于 3 天项目经理审核后，直接结算
                    machine.setState (new AuditOverState ());
                }
            } else {
                machine.setState (new AuditOverState ());

            }
            vo.setResult ("项目经理审核结果是：" + result);
            // 继续执行下一步操作
            machine.doWork ();
        }
    }
}
