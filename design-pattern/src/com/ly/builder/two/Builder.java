package com.ly.builder.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.builder.two
 * @ClassName: Builder
 * @Author: lin
 * @Description: 抽象的建造者类，定义类一系列的产品生产抽象接口
 * @Date: 2019-07-10 14:13
 * @Version: 1.0
 */
public abstract class Builder {

    public abstract void BuildPartA();

    public abstract void BuildPartB();

    public abstract Product getResult();
}
