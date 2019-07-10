package com.ly.templatemethod.paper;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.templatemethod.paper
 * @ClassName: StudentAPaper
 * @Author: lin
 * @Description: 学生A的试卷和答案
 * @Date: 2019-07-09 15:23
 * @Version: 1.0
 */
public class StudentAPaper extends Paper {
    @Override
    public String answer1() {
        return "A";
    }

    @Override
    public String answer2() {
        return "B";
    }

    @Override
    public String answer3() {
        return "C";
    }
}
