package com.ly.memento.one;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.memento.one
 * @ClassName: Caretaker
 * @Author: lin
 * @Description: 管理者,用于管理保存的数据
 * @Version: 1.0
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
