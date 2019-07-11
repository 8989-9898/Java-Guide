package com.ly.observer.three;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.one
 * @ClassName: Secretary
 * @Author: lin
 * @Description: 前台通知类
 * @Date: 2019-07-10 14:51
 * @Version: 1.0
 */
public class Secretary extends Subject {


    @Override
    public void addListener(Object object, String methodName, Object... args) {
        this.getEventHandler().addEvent(object, methodName, args);
    }

    @Override
    public void nofityX() {
        this.getEventHandler().notifyX();
    }
}
