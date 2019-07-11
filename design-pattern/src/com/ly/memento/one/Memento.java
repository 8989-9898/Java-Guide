package com.ly.memento.one;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.memento.one
 * @ClassName: Memento
 * @Author: lin
 * @Description: 备忘录，保存数据的容器
 * @Version: 1.0
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
