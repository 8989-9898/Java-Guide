package com.ly.mediator.mediator;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.mediator
 * @ClassName: ConcreteColleague1
 * @Author: lin
 * @Description: 具体的同事类 1
 * @Date: 2019-07-15 13:16
 * @Version: 1.0
 */
public class ConcreteColleague1 extends Colleague{
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        // 发送消息是由中介者发送的
        mediator.send(message,this);
    }

    public void notifys(String message){
        System.out.println("同事1接收到的消息是："+message);
    }
}
