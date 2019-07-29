package com.ly.mediator.mediator;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator
 * @ClassName: ConcreteColleagueA
 * @Author: lin
 * @Description: 具体的同事类A
 * @Date: 2019-07-29 14:49
 * @Version: 1.0
 */
public class ConcreteColleagueA extends Colleague {
    /**
     * 传入中介者对象
     *
     * @param mediator
     */
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    /**
     * 执行某些业务操作
     */
    public void someOperation(String message){
        this.getMediator().change(this,message);
    }

    public void println(String message){
        System.out.println("同事 A 收到消息："+message);
    }
}
