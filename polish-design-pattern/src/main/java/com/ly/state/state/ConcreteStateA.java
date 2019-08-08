package com.ly.state.state;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.state
 * @ClassName: ConcreteStateA
 * @Author: lin
 * @Description: 一种具体的状态实现
 * @Date: 2019-08-08 11:09
 * @Version: 1.0
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(String param) {
        System.out.println ("当前是在A状态的实现中："+param);
    }
}
