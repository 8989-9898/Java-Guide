package com.ly.decorator.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.two
 * @ClassName: Suit
 * @Author: lin
 * @Description: 西装
 * @Date: 2019-07-08 9:33
 * @Version: 1.0
 */
public class Suit extends Finery {
    @Override
    public void show() {
        System.out.println("西装");
        super.show();
    }
}
