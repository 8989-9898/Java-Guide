package com.ly.observer.one;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.one
 * @ClassName: Observers
 * @Author: lin
 * @Description: 抽象观察者
 * @Date: 2019-07-10 14:38
 * @Version: 1.0
 */
public abstract class Observers {
    protected String name;
    protected Subject subject;

    public Observers(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    /**
     * 通知的方法
     */
    public abstract void update();
}
