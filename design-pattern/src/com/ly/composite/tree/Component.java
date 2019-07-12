package com.ly.composite.tree;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.composite.tree
 * @ClassName: Component
 * @Author: lin
 * @Description: 声明组合中的接口
 * @Date: 2019-07-12 14:56
 * @Version: 1.0
 */
public abstract class Component {
    protected String name;

    public  abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display(int depth);


    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
