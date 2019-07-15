package com.ly.mediator.mediator;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.mediator
 * @ClassName: Mediator
 * @Author: lin
 * @Description: 抽象中介者类
 * @Date: 2019-07-15 13:11
 * @Version: 1.0
 */
public abstract class Mediator {
    public abstract void send(String message,Colleague colleague);
}
