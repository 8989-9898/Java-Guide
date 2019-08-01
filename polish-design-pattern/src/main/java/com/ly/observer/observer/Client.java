package com.ly.observer.observer;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.observer
 * @ClassName: Client
 * @Author: lin
 * @Description: 观察者模式的示例
 * @Date: 2019-08-01 9:39
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建目标类
        ConcreteSubject concreteSubject = new ConcreteSubject();
        // 创建观察者
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();
        ConcreteObserver observer3 = new ConcreteObserver();
        // 将观察者添加到目标中
        concreteSubject.attach(observer1);
        concreteSubject.attach(observer2);
        concreteSubject.attach(observer3);
        // 更改目标状态
        concreteSubject.setSubjectState("目标状态更改");
    }

    /**
     * 观察者模式的优点
     *      观察者模式实现了观察者与目标对象之间的抽象耦合：原本目标对象在状态发送改变的时候，需要直接调用所有的观察者对象，但是抽象出观察者接口后
     *      ，目标和观察者就只有在抽象层面上的耦合了，也就是只知道观察者的接口，并不知道具体的实现类，从而实现目标类和具体的观察者之间解耦。
     *
     *      观察者模式实现了动态联动：所谓联动，就是做一个操作会引起其他的相关操作。由于观察者模式对观察者实行注册管理，那就可以在运行期间通过动态
     *      的控制注册的观察者，来控制某个动作的联动范围，从而实现动态联动。
     *
     *      观察者模式支持广播：由于目标发送通知给观察者是面向所有注册观察者的，所以每次通知的信息都是对所有的注册观察者进行广播。也可以通过在目标
     *      上添加新的功能来限制广播的范围。使用广播可能出现死循环，如：A和B互为观察者和目标对象（被观察者），在A发生变化时通知B，B发生变化时通知A，
     *      就会出现死循环。
     *
     *
     * 观察者模式的缺点
     *      可能引起无谓的操作：由于观察者模式每次都是广播信息，不管观察者需不需要，每个观察者都会调用 update 方法，如果观察不需要执行相应的处理，那
     *      么这次操作就浪费了。还有可能出现误操作，比如：在执行某个更新操作之前要删除某个观察者，这样在通知时就没有这个观察者了，但是现在忘掉了，那
     *      么就引起误操作。
     *
     * 观察者模式的本质是：触发联动。
     * */
}
