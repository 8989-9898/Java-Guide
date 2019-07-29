package com.ly.mediator.mediator;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator
 * @ClassName: Client
 * @Author: lin
 * @Description: 中介者模式的实例
 * @Date: 2019-07-29 15:00
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueA a = new ConcreteColleagueA(mediator);
        ConcreteColleagueB b = new ConcreteColleagueB(mediator);
        mediator.setA(a);
        mediator.setB(b);

        a.someOperation(" BB ,在吗？来打野了");
        b.someOperation(" AA ,不当咸鱼，写代码");

    }
}
