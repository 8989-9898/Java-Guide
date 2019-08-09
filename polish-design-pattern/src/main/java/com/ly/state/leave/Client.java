package com.ly.state.leave;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.leave
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用状态模式完成请假流程
 * @Date: 2019-08-09 10:09
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建上下文对象
        LeaveRequestContext context = new LeaveRequestContext ();
        // 设置业务对象
        context.setBusinessVO (new LeaveRequestModel ("flank","2019-08-09",5));
        // 配置上下文对象，设置开始时的状态
        context.setState (new ProjectManagerState ());
        // 开始请求
        context.doWork ();

    }
}
