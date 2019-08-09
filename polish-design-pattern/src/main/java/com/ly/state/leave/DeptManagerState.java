package com.ly.state.leave;

import java.util.Scanner;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.leave
 * @ClassName: DeptManagerState
 * @Author: lin
 * @Description: 处理部门经理的审核，处理好后是审核结束状态
 * @Date: 2019-08-09 10:41
 * @Version: 1.0
 */
public class DeptManagerState implements State {
    @Override
    public void doWork(StateMachine machine) {
// 首先获取请假单的数据模型
        LeaveRequestModel vo = (LeaveRequestModel) machine.getBusinessVO ();
        System.out.println ("部门经理审核中，请稍后.......");
        System.out.println (vo.getUser () + " 申请从 " + vo.getBeginDate () + " 开始请假 " + vo.getLeaveDays () + " 天，部门经理审核（1、同意  2、不同意）");
        Scanner scanner = new Scanner (System.in);
        if (scanner.hasNext ()) {
            String result = "不同意";
            if (scanner.nextInt () == 1) {
                result = "同意";
            }
            // 部门经理审核完就直接结束了
            machine.setState (new AuditOverState ());
            vo.setResult ("项目经理审核结果是：" + result);
            // 继续执行下一步操作
            machine.doWork ();
        }
    }
}
