package com.ly.state.state;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.state
 * @ClassName: Context
 * @Author: lin
 * @Description: 定义客户端感兴趣的接口，维护一个State类型的对象实例
 * @Date: 2019-08-08 11:10
 * @Version: 1.0
 */
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 用户实际调用的方法
     * @param param
     */
    public void handle(String param){
        // 转调对应的状态方法
        state.handle (param);
    }
}
