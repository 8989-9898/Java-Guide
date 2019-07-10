package com.ly.decorator.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.two
 * @ClassName: Sneakers
 * @Author: lin
 * @Description: 破球鞋类
 * @Date: 2019-07-08 9:32
 * @Version: 1.0
 */
public class Sneakers extends Finery {
    @Override
    public void show() {
        System.out.println("破球鞋");
        super.show();
    }
}
