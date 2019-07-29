package com.ly.mediator.mediator;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator
 * @ClassName: Colleague
 * @Author: lin
 * @Description: 抽象的同事父类
 * @Date: 2019-07-29 14:45
 * @Version: 1.0
 */
public abstract class Colleague {

    /**
     * 持有中介者的对象，每一个同事类读知道它的中介者对象
     */
    private Mediator mediator;

    /**
     * 传入中介者对象
     * @param mediator
     */
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 获取中介者对象
     * @return
     */
    public Mediator getMediator() {
        return mediator;
    }
}
