package com.ly.observer.observer;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.observer
 * @ClassName: ConcreteSubject
 * @Author: lin
 * @Description: 具体的目标对象
 * @Date: 2019-08-01 9:32
 * @Version: 1.0
 */
public class ConcreteSubject extends Subject {
    /**
     * 目标对象状态
     */
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        // 目标状态发生改变，通知所有观察者
        this.notifyObservers();
    }
}
