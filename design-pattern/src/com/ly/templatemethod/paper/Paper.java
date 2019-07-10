package com.ly.templatemethod.paper;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.templatemethod.paper
 * @ClassName: Paper
 * @Author: lin
 * @Description: 试卷模板类
 * @Date: 2019-07-09 15:10
 * @Version: 1.0
 */
public abstract class Paper {

    public void testQuestion1() {
        System.out.println("什么语言是世界上最好的语言（  ）？\n\tA.java\n\tB.C++\n\tC.PHP\n\tD.Python");
        System.out.println("答案:" + answer1());
    }

    public void testQuestion2() {
        System.out.println("SpringMVC和SpringBoot是什么关系（  ）？\n\tA.父子关系\n\tB.上下级关系\n\tC.没有关系\n\tD.都不是");
        System.out.println("答案:" + answer2());
    }

    public void testQuestion3() {
        System.out.println("Mybatis比hibernate（  ）？\n\tA.更笨重\n\tB.更灵活\n\tC.更高效\n\tD.高级");
        System.out.println("答案:" + answer3());
    }

    public abstract String answer1();

    public abstract String answer2();

    public abstract String answer3();
}
