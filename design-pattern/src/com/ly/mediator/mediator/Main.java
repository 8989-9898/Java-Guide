package com.ly.mediator.mediator;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-15 11:24
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        // 中介者
        ConcreteMediator mediator = new ConcreteMediator();

        // 让两个具体的同事类认识中介者
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        // 让中介者认识具体的同事类
        mediator.setConcreteColleague1(colleague1);
        mediator.setConcreteColleague2(colleague2);

        colleague1.send("吃过饭了吗");
        colleague2.send("还没有，你打算请客吗");

    }
}
