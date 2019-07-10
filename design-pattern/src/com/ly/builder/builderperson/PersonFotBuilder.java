package com.ly.builder.builderperson;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.builder.builderperson
 * @ClassName: PersonFotBuilder
 * @Author: lin
 * @Description: 具体创建胖子的类
 * @Date: 2019-07-10 14:02
 * @Version: 1.0
 */
public class PersonFotBuilder extends PersonBuilder {

    public PersonFotBuilder() {
        System.out.println("开始画胖子");
    }

    @Override
    public void buildHead() {
        System.out.println("画胖子的头");
    }

    @Override
    public void buildBody() {
        System.out.println("画胖子的身体");

    }

    @Override
    public void buildArmLeft() {
        System.out.println("画胖子的左手");

    }

    @Override
    public void buildArmRight() {
        System.out.println("画胖子的右手");

    }

    @Override
    public void buildLegLeft() {
        System.out.println("画胖子的左脚");

    }

    @Override
    public void buildLegright() {
        System.out.println("画胖子的右脚");

    }
}
