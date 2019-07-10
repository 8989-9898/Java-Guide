package com.ly.observer.one;

import java.util.ArrayList;
import java.util.List;

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

    private List<Observers> observers = new ArrayList<>();


    /**
     *  添加一个通知对象
     * @param observer
     */
    @Override
    public void attach(Observers observer) {
        observers.add(observer);
    }

    /**
     * 减少一个通知对象
     * @param observer
     */
    @Override
    public void detach(Observers observer) {
        observers.remove(observer);
    }

    @Override
    public void notifys() {
        observers.forEach((e)->e.update());
    }
}
