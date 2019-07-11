package com.ly.state.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.two
 * @ClassName: ConcreteStateA
 * @Author: lin
 * @Description: 真实的状态A
 * @Date: 2019-07-11 15:01
 * @Version: 1.0
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
