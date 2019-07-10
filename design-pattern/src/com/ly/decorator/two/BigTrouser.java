package com.ly.decorator.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.two
 * @ClassName: BigTrouser
 * @Author: lin
 * @Description: 垮裤类
 * @Date: 2019-07-08 9:31
 * @Version: 1.0
 */
public class BigTrouser extends Finery {
    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}
