package com.ly.memento.one;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.memento.one
 * @ClassName: Originator
 * @Author: lin
 * @Description: 备忘录发起人
 * @Version: 1.0
 */
public class Originator {


    private String state;

    /**
     * 创建备忘录，将当前要保存的数据导入并实例化一个 Memento 对象
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void show() {
        System.out.println("显示数据：" + state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
