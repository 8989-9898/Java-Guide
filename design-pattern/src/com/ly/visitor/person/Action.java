package com.ly.visitor.person;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.person
 * @ClassName: Action
 * @Author: lin
 * @Description: 状态抽象类
 * @Date: 2019-07-16 8:28
 * @Version: 1.0
 */
public abstract class Action {
    public abstract void getManConclusion(Man man);
    public abstract void getWomanConclusion(Woman woman);
}
