package com.ly.memento.memento;

import java.net.CacheRequest;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.memento.memento
 * @ClassName: Client
 * @Author: lin
 * @Description: 备忘录模式的简单事例
 * @Date: 2019-08-09 16:20
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator ();
        // 设置初始数据
        originator.setState ("start");
        System.out.println ("开始时数据："+originator.getState ());
        // 为数据创建备忘录，用于对当前数据的不同操作
        Memento memento = originator.createMemento ();
        Caretaker caretaker = new Caretaker ();
        caretaker.saveMemento (memento);
        // 修改数据
        originator.setState ("change");
        System.out.println ("修改后的数据："+originator.getState ());
        // 使用备忘录将数据还原，进行其它操作
        originator.setMemento (caretaker.retriveMemento ());
        System.out.println ("使用备忘录还原的数据："+originator.getState ());
    }
}
