package com.ly.visitor.person;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.person
 * @ClassName: Man
 * @Author: lin
 * @Description: 男人类
 * @Date: 2019-07-16 8:34
 * @Version: 1.0
 */
public class Man extends Person{
    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
