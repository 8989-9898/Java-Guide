package com.ly.observer.observer;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.observer
 * @ClassName: ConcreteObserver
 * @Author: lin
 * @Description: 具体的某个观察者
 * @Date: 2019-08-01 9:35
 * @Version: 1.0
 */
public class ConcreteObserver implements Observer{
    /**
     * 观察者的状态
     */
    private String observerState;

    @Override
    public void update(Subject subject) {
        // 具体的更新方法，修改观察者的状态，和目标状态保存一致
        observerState=((ConcreteSubject)subject).getSubjectState();
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ConcreteObserver{" +
                "observerState='" + observerState + '\'' +
                '}';
    }
}
