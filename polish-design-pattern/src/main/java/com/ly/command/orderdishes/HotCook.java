package com.ly.command.orderdishes;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.orderdishes
 * @ClassName: HotCook
 * @Author: lin
 * @Description: 做热菜的厨师（具体的接受者）
 * @Date: 2019/8/3 15:34
 * @Version: 1.0
 */
public class HotCook implements CookApi {
    @Override
    public void cook(String name) {
        System.out.println("本厨师正在做："+name);
    }
}
