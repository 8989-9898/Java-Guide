package com.ly.builder.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.builder.two
 * @ClassName: Director
 * @Author: lin
 * @Description: 建造者中的指挥者类，指挥具体的建造流程
 * @Date: 2019-07-10 14:19
 * @Version: 1.0
 */
public class Director {
    public void create(Builder builder){
        builder.BuildPartA();
        builder.BuildPartB();
    }
}
