package com.ly.facade.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.facade.two
 * @ClassName: Facade
 * @Author: lin
 * @Description: 外观模式类，用于组装方法，实现不同的功能
 * @Date: 2019-07-09 16:53
 * @Version: 1.0
 */
public class Facade {

    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;
    private SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("第一种功能接口的组合实现");
        one.one();
        three.three();
        two.two();
    }

    public void methodB() {
        System.out.println("第二种功能接口的组合实现");
        four.four();
        one.one();
        two.two();
    }
}
