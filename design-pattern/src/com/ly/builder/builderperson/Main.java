package com.ly.builder.builderperson;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.builder.builderperson
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-10 14:08
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        PersonBuilder thin = new PersonThinBuilder();
        PersonDirector director = new PersonDirector(thin);
        director.createPerson();

        PersonBuilder fot = new PersonFotBuilder();
        PersonDirector director1 = new PersonDirector(fot);
        director1.createPerson();
    }
}
