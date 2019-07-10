package com.ly.builder.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.builder.two
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-10 14:20
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();
        director.create(builder1);
        builder1.getResult().show();

        director.create(builder2);
        builder2.getResult().show();

    }
}
