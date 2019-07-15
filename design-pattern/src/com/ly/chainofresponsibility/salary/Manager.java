package com.ly.chainofresponsibility.salary;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chainofresponsibility.salary
 * @ClassName: Manager
 * @Author: lin
 * @Description: 管理者抽象类
 * @Date: 2019-07-15 11:02
 * @Version: 1.0
 */
public abstract class Manager {
    protected String name;
    /**
     * 管理者的上级
     */
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplication(Request request);
}
