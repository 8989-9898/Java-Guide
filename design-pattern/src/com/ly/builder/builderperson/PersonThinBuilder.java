package com.ly.builder.builderperson;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.builder.builderperson
 * @ClassName: PersonThinBuilder
 * @Author: lin
 * @Description: 具体创建小人的瘦子类
 * @Date: 2019-07-10 13:59
 * @Version: 1.0
 */
public class PersonThinBuilder extends PersonBuilder {

    public PersonThinBuilder() {
        System.out.println("开始画瘦子");
    }

    @Override
    public void buildHead() {
        System.out.println("画瘦子的头");
    }

    @Override
    public void buildBody() {
        System.out.println("画瘦子的身体");

    }

    @Override
    public void buildArmLeft() {
        System.out.println("画瘦子的左手");

    }

    @Override
    public void buildArmRight() {
        System.out.println("画瘦子的右手");

    }

    @Override
    public void buildLegLeft() {
        System.out.println("画瘦子的左脚");

    }

    @Override
    public void buildLegright() {
        System.out.println("画瘦子的右脚");

    }
}
