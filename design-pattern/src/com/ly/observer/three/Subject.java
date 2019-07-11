package com.ly.observer.three;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.one
 * @ClassName: Subject
 * @Author: lin
 * @Description: 通知者的抽象类
 * @Date: 2019-07-10 14:36
 * @Version: 1.0
 */
public abstract class Subject {

    private EventHandler eventHandler=new EventHandler();
    private String state;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public abstract void addListener(Object object,String methodName,Object... args);
    public abstract void nofityX();
}
