package com.ly.chain.of.responsibility.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.pattern
 * @ClassName: ConcreteHandlerA
 * @Author: lin
 * @Description: 实现指责的类，在这个类中，实现对在他职责范围内请求的处理，如果不处理就继续向后转发给后继者
 * @Date: 2019-08-16 11:04
 * @Version: 1.0
 */
public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest() {
        // 根据条件判断是不是自己能够处理的职责，不是就转发给后继者
        if (false) {
            System.out.println (this);
        } else {
            // 判断是否有后继者，没有就什么也不干，就结束了
            if (this.successor != null) {
                this.successor.handleRequest ();
            }
        }
    }
}
