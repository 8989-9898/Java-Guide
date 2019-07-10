package com.ly.decorator.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.two
 * @ClassName: Finery
 * @Author: lin
 * @Description: 定义服装的装饰类
 * @Date: 2019-07-08 9:25
 * @Version: 1.0
 */
public class Finery extends Person {

    protected Person person;

    public void decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person!=null) {
            person.show();
        }
    }
}
