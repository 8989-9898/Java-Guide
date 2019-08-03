package com.ly.command.orderdishes;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.orderdishes
 * @ClassName: HotCook
 * @Author: lin
 * @Description: 做凉菜的厨师（具体的接受者）
 * @Date: 2019/8/3 15:34
 * @Version: 1.0
 */
public class CoolCook implements CookApi {
    @Override
    public void cook(String name) {
        System.out.println("凉菜：" + name + " 已经做好了，本厨师正在装盘！");
    }
}
