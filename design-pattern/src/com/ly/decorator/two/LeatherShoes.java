package com.ly.decorator.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.two
 * @ClassName: LeatherShoes
 * @Author: lin
 * @Description: 皮鞋
 * @Date: 2019-07-08 9:34
 * @Version: 1.0
 */
public class LeatherShoes extends Finery {
    @Override
    public void show() {
        System.out.println("皮鞋");
        super.show();
    }
}
