package com.ly.observer.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.two
 * @ClassName: ConcreteObserver
 * @Author: lin
 * @Description: 具体的观察者
 * @Date: 2019-07-10 15:07
 * @Version: 1.0
 */
public class ConcreteObserver implements Observer {
    private String name;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("观察者"+name+"的新状态是："+subject.getState());
    }
}
