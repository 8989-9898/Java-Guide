package com.ly.decorator.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.two
 * @ClassName: TShirts
 * @Author: lin
 * @Description: T恤类
 * @Date: 2019-07-08 9:29
 * @Version: 1.0
 */
public class TShirts extends Finery {
    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
