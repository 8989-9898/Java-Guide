package com.ly.state.state;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.state
 * @ClassName: State
 * @Author: lin
 * @Description: 封装一个与 Context 的特定状态的接口
 * @Date: 2019-08-08 11:07
 * @Version: 1.0
 */
public interface State {

    /**
     * 状态对应的处理
     * @param param
     */
    public void handle(String param);
}
