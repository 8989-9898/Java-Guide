package com.ly.memento.one;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.memento.one
 * @ClassName: Main
 * @Author: lin
 * @Description: ${description}
 * @Date: ${date} ${time}
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("NO");
        originator.show();

        Caretaker caretaker = new Caretaker();
        // 保存数据
        caretaker.setMemento(originator.createMemento());

        originator.setState("YES");
        originator.show();

        originator.setMemento(caretaker.getMemento());
        originator.show();

    }
}
