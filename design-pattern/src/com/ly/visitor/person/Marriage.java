package com.ly.visitor.person;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.person
 * @ClassName: Marriage
 * @Author: lin
 * @Description: 结婚状态
 * @Date: 2019-07-16 8:48
 * @Version: 1.0
 */
public class Marriage extends Action {

    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName() + " " + this.getClass().getSimpleName() + " 时，感慨道：恋爱游戏结束，“有妻徒刑”，遥无期");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(woman.getClass().getSimpleName() + " " + this.getClass().getSimpleName() + " 时，欣慰道: 爱情长跑路漫漫，婚姻保险保平安");
    }
}
