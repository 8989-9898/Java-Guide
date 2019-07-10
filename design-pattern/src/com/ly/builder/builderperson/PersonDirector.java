package com.ly.builder.builderperson;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.builder.builderperson
 * @ClassName: PersonDirector
 * @Author: lin
 * @Description: 建造者模式中的指挥者，用于指挥建造的顺序
 * @Date: 2019-07-10 14:05
 * @Version: 1.0
 */
public class PersonDirector {

    private PersonBuilder builder;

    public PersonDirector(PersonBuilder builder) {
        this.builder = builder;
    }

    public void createPerson(){
        builder.buildHead();
        builder.buildBody();
        builder.buildArmLeft();
        builder.buildArmRight();
        builder.buildLegLeft();
        builder.buildLegright();
    }
}
