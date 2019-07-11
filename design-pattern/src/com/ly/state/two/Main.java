package com.ly.state.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.two
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-11 15:06
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
