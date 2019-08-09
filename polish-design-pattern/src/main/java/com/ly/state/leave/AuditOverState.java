package com.ly.state.leave;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.leave
 * @ClassName: AuditOverState
 * @Author: lin
 * @Description: 请假流程结束时的处理类
 * @Date: 2019-08-09 10:40
 * @Version: 1.0
 */
public class AuditOverState implements State {
    @Override
    public void doWork(StateMachine machine) {
        // 首先获取请假单的数据模型
        LeaveRequestModel vo = (LeaveRequestModel) machine.getBusinessVO ();
        System.out.println (vo.getUser () + " 你的请假结果是： " + vo.getResult ());
    }
}
