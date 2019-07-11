package com.ly.memento.memento;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.memento.memento
 * @ClassName: RoleStateCaretaker
 * @Author: lin
 * @Description: 角色信息保存类
 * @Version: 1.0
 */
public class RoleStateCaretaker {
    private RoleMemento memento;

    public RoleMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleMemento memento) {
        this.memento = memento;
    }
}
