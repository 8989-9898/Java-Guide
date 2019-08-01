package com.ly.observer.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.observer
 * @ClassName: Subject
 * @Author: lin
 * @Description: 定义目标对象，就是被观察者对象，知道观察他的观察者，提供添加和删除观察者的方法
 * @Date: 2019-08-01 9:17
 * @Version: 1.0
 */
public class Subject {

    /**
     * 用来保存观察者
     */
    private List<Observer> observers=new ArrayList<>();

    /**
     * 添加观察者
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void detach(Observer observer){
        observers.remove(observer);
    }

    /**
     * 状态改变，通知所有观察者
     */
    public void notifyObservers(){

        observers.forEach((e)->{e.update(this);});
}
}
