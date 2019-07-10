package com.ly.observer.one;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.one
 * @ClassName: Subject
 * @Author: lin
 * @Description: 通知的接口
 * @Date: 2019-07-10 14:36
 * @Version: 1.0
 */
public abstract class Subject {

    public abstract void attach(Observers observers);

    public abstract void detach(Observers observers);

    public abstract void notifys();

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
