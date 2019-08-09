package com.ly.state.leave;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.leave
 * @ClassName: StateMachine
 * @Author: lin
 * @Description: 公共状态处理机，相当于状态模式的Context
 *              包含所有流程使用状态时的公共功能
 * @Date: 2019-08-09 10:10
 * @Version: 1.0
 */
public class StateMachine {

    /**
     * 持有一个状态对象
     */
    private State state;

    /**
     * 包含流程处理需要的业务对象，不知具体的类型，为了简单，不使用泛型
     * 用Object
     */
    private Object businessVO=null;

    /**
     * 执行工作，客户端处理流程的接口方法
     * 在客户在完成自己的业务工作后调用
     */
    public void doWork(){
        // 转调相应状态对象的真正处理方法
        this.state.doWork(this);
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Object getBusinessVO() {
        return businessVO;
    }

    public void setBusinessVO(Object businessVO) {
        this.businessVO = businessVO;
    }
}
