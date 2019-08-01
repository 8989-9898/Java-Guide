package com.ly.observer.newspaper;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用观察者模式实现报纸的订阅和阅读
 * @Date: 2019-08-01 9:18
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建某类型的报纸
        NewsPaper paper = new NewsPaper();
        // 创建订阅者
        Reader reader1 = new Reader("张三");
        Reader reader2 = new Reader("李四");
        Reader reader3 = new Reader("王五");
        // 报纸添加订阅者
        paper.attach(reader1);
        paper.attach(reader2);
        paper.attach(reader3);
        // 更新报纸
        paper.setContent("研磨设计模式之观察者模式");
    }
}
