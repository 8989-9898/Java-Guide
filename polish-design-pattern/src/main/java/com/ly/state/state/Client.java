package com.ly.state.state;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.state
 * @ClassName: Client
 * @Author: lin
 * @Description: 状态模式的简单实例
 * @Date: 2019-08-08 10:52
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建相应的状态
        State a = new ConcreteStateA ();
        State b = new ConcreteStateB ();

        Context context = new Context ();
        // 设置对应的状态
        context.setState (b);
        context.handle ("start");
    }
}
