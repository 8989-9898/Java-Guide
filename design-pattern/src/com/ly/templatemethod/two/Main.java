package com.ly.templatemethod.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.templatemethod.two
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-09 15:37
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        AbstractClass abstractClassA=new ConcreteClassA();
        AbstractClass abstractClassB=new ConcreteClassB();
        abstractClassA.template();
        System.out.println("\n\n");
        abstractClassB.template();
    }
}
