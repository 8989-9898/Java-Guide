package com.ly.decorator.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.two
 * @ClassName: Tie
 * @Author: lin
 * @Description: 顶带类
 * @Date: 2019-07-08 9:33
 * @Version: 1.0
 */
public class Tie extends Finery {
    @Override
    public void show() {
        System.out.println("顶带");
        super.show();
    }
}
