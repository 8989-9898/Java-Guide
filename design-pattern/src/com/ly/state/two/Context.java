package com.ly.state.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.two
 * @ClassName: Context
 * @Author: lin
 * @Description:
 * @Date: 2019-07-11 15:01
 * @Version: 1.0
 */
public class Context {
    private State state;

    public void request(){
        // 对请求做处理，并设置下一个状态
        state.handle(this);
    }

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态是："+state.getClass().getName());
    }
}
