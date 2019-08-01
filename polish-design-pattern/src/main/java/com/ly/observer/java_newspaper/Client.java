package com.ly.observer.java_newspaper;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.java_newspaper
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用java中的观察者模式实现报纸订阅
 * @Date: 2019-08-01 10:36
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
        paper.addObserver(reader1);
        paper.addObserver(reader2);
        paper.addObserver(reader3);
        // 更新报纸
        paper.setContent("研磨设计模式之观察者模式");
    }

    /**
     * 使用java自带的观察者模式就不需要在自己定义 观察者接口和目标类的父类了。由 java 定义好了，在 java.util.Observable 包里
     * */
}
