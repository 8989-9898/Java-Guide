package com.ly.observer.push_newspaper;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.push_newspaper
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用推模式的报纸订阅
 * @Date: 2019-08-01 10:14
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建某类型的报纸
        NewsPaper paper = new NewsPaper();
        // 创建订阅者
        Reader reader1 = new Reader("张三");
        Reader reader3 = new Reader("王五");
        Reader reader2 = new Reader("李四");
        // 报纸添加订阅者
        paper.attach(reader1);
        paper.attach(reader2);
        paper.attach(reader3);
        // 更新报纸
        paper.setContent("研磨设计模式之观察者模式");
    }

    /**
     * 推模式：
     *      目标对象主动向观察者推行目标的详细信息，不过观察者是否需要，推送的通常是目标对象的全部或者部分数据，相当于广播通信。
     * 拉模式：
     *      目标对象在通知观察者的时候，只传递少量数据。如果观察者需要更多的具体数据，由观察者主动到目标对象中获取，相当于是观察者
     *      从目标对象中拉取数据。一般这种模式会将目标对象通过观察者的update方法传递给观察者，在观察者中根据这个对象自己去获取需要
     *      的数据。
     *
     * 两种模式的比较：
     *      推模式是假定目标对象知道观察者对象需要的数据。
     *      拉模式是目标对象不知道观察者具体需要什么数据，没有办法的情况下，将自身传递给观察者，让观察者自己去获取。
     *      推模式可能会使观察者难以复用，因为观察者的update方法是按需定义的，可能无法考虑到无法兼顾的情况。这就意味着出现新的情况
     *      ，就可能需要提供新的update方法，甚至是重新定义观察者。
     *
     *
     * */
}
