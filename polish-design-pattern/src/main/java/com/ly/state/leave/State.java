package com.ly.state.leave;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.leave
 * @ClassName: State
 * @Author: lin
 * @Description: 状态接口
 * @Date: 2019-08-09 10:12
 * @Version: 1.0
 */
public interface State {
    /**
     * 执行状态对象的功能
     * @param stateMachine 上下文的实例对象
     */
    void doWork(StateMachine stateMachine);
}
