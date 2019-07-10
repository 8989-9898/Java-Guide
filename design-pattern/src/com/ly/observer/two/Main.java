package com.ly.observer.two;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.two
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-10 15:13
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver("YY",subject));
        subject.attach(new ConcreteObserver("BB",subject));
        subject.attach(new ConcreteObserver("DD",subject));

        subject.setState("下雨了，收衣服");
        subject.notifys();
    }
}
