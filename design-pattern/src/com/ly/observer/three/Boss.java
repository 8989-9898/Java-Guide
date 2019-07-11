package com.ly.observer.three;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.one
 * @ClassName: Boss
 * @Author: lin
 * @Description: 具体的通知老板类
 * @Date: 2019-07-10 14:40
 * @Version: 1.0
 */
public class Boss extends Subject {


    @Override
    public void addListener(Object object, String methodName, Object... args) {
        this.getEventHandler().addEvent(object, methodName,args);
    }

    @Override
    public void nofityX() {
        this.getEventHandler().notifyX();
    }
}
