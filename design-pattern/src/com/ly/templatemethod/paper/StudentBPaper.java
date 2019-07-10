package com.ly.templatemethod.paper;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.templatemethod.paper
 * @ClassName: StudentBPaper
 * @Author: lin
 * @Description: 学生B的试卷和答案
 * @Date: 2019-07-09 15:24
 * @Version: 1.0
 */
public class StudentBPaper extends Paper{
    @Override
    public String answer1() {
        return "B";
    }

    @Override
    public String answer2() {
        return "C";
    }

    @Override
    public String answer3() {
        return "A";
    }
}
