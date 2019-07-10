package com.ly.builder.builderperson;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.builder.builderperson
 * @ClassName: PersonBuilder
 * @Author: lin
 * @Description: 建造者模式的抽象建造类,定义创建小人必须的抽象方法
 * @Date: 2019-07-10 13:55
 * @Version: 1.0
 */
public abstract class PersonBuilder {

    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildArmLeft();
    public abstract void buildArmRight();
    public abstract void buildLegLeft();
    public abstract void buildLegright();
}
