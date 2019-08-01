package com.ly.observer.newspaper;

import javax.xml.bind.attachment.AttachmentMarshaller;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.newspaper
 * @ClassName: Subject
 * @Author: lin
 * @Description: 目标对象，被观察者
 * @Date: 2019-08-01 9:42
 * @Version: 1.0
 */
public class Subject {
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
        observers.add(observer);
    }

    /**
     * 通知方法
     */
    public void notifyObservers(){
        observers.forEach((e)->e.update(this));
    }
}
