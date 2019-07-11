package com.ly.state.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.two
 * @ClassName: ConcreteStateB
 * @Author: lin
 * @Description: 真实的状态B
 * @Date: 2019-07-11 15:02
 * @Version: 1.0
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
