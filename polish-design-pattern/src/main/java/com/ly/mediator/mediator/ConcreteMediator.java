package com.ly.mediator.mediator;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator
 * @ClassName: ConcreteMediator
 * @Author: lin
 * @Description: 具体的中介者对象
 * @Date: 2019-07-29 14:52
 * @Version: 1.0
 */
public class ConcreteMediator implements Mediator {

    /**
     * 持有需要中介者的对象 A
     */
    private ConcreteColleagueA a;
    /**
     * 持有需要中介者的对象 B
     */
    private ConcreteColleagueB b;

    public void setA(ConcreteColleagueA a) {
        this.a = a;
    }

    public void setB(ConcreteColleagueB b) {
        this.b = b;
    }

    @Override
    public void change(Colleague colleague, String message) {
        if (a == colleague) {
            b.println(message);
        } else if (b == colleague) {
            a.println(message);
        }
    }
}
