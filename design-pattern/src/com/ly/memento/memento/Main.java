package com.ly.memento.memento;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.memento.memento
 * @ClassName: Main
 * @Author: lin
 * @Description: ${description}
 * @Date: ${date} ${time}
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Role role = new Role();
        role.show();
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        // 保存进度
        roleStateCaretaker.setMemento(role.saveRole());

        // 战斗Boss GG
        role.Fight();
        role.show();

        // 载入进度，继续战斗
        role.recoveryState(roleStateCaretaker.getMemento());
        role.show();

    }
}
