package com.ly.mediator.mediator;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.mediator
 * @ClassName: ConcreteMediator
 * @Author: lin
 * @Description: 具体的中介者类
 * @Date: 2019-07-15 13:14
 * @Version: 1.0
 */
public class ConcreteMediator extends Mediator {

    /**
     * 需要了解的具体同时对象
     */
    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (this.concreteColleague1 == colleague) {
            // 重写发送消息的方法，根据对象做出选择判断，通知对象
            concreteColleague2.notifys(message);
        } else if (this.concreteColleague2 == colleague) {
            concreteColleague1.notifys(message);
        }
    }
}
