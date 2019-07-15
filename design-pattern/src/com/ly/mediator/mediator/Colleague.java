package com.ly.mediator.mediator;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.mediator
 * @ClassName: Colleague
 * @Author: lin
 * @Description: 抽象同事类
 * @Date: 2019-07-15 13:12
 * @Version: 1.0
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
