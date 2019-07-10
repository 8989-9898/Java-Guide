package com.ly.decorator.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.two
 * @ClassName: Person
 * @Author: lin
 * @Description: 定义人类
 * @Date: 2019-07-08 9:22
 * @Version: 1.0
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的是:" + this.name);
    }
}
