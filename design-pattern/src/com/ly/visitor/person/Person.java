package com.ly.visitor.person;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.person
 * @ClassName: Person
 * @Author: lin
 * @Description: 人类的抽象类
 * @Date: 2019-07-16 8:33
 * @Version: 1.0
 */
public abstract class Person {
    public abstract void accept(Action visitor);
}
