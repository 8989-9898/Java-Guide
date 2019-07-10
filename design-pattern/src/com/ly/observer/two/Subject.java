package com.ly.observer.two;


import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.two
 * @ClassName: Subject
 * @Author: lin
 * @Description: 主题抽象通知者
 * @Date: 2019-07-10 15:01
 * @Version: 1.0
 */
public abstract class Subject {
    private List<Observer> observers=new ArrayList<>();

    /**
     *  添加一个通知对象
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 减少一个通知对象
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifys() {
        observers.forEach((e)->e.update());
    }
}
