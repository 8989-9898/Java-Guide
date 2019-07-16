package com.ly.visitor.person;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.person
 * @ClassName: Woman
 * @Author: lin
 * @Description: 女人类
 * @Date: 2019-07-16 8:34
 * @Version: 1.0
 */
public class Woman extends Person{
    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}
