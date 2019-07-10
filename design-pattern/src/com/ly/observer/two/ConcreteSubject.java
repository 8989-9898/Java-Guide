package com.ly.observer.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.two
 * @ClassName: ConcreteSubject
 * @Author: lin
 * @Description: 具体的主题或具体的通知者
 * @Date: 2019-07-10 15:05
 * @Version: 1.0
 */
public class ConcreteSubject extends Subject {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
