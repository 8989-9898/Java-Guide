package com.ly.templatemethod.paper;

import java.beans.EventHandler;
import java.util.EventListener;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.templatemethod.paper
 * @ClassName: Main
 * @Author: lin
 * @Description: 模块方法模式的入口
 * @Date: 2019-07-09 15:25
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Paper paperA=new StudentAPaper();
        System.out.println("第一位同学的试卷");
        paperA.testQuestion1();
        paperA.testQuestion2();
        paperA.testQuestion3();
        Paper paperB=new StudentBPaper();
        System.out.println("第二位同学的试卷");
        paperB.testQuestion1();
        paperB.testQuestion2();
        paperB.testQuestion3();
    }
}
