package com.ly.mediator.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.pattern
 * @ClassName: Colleague
 * @Author: lin
 * @Description: 定义电脑组件的抽象父类
 * @Date: 2019-07-29 15:17
 * @Version: 1.0
 */
public class Colleague {

    /**
     * 定义中介者
     */
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
