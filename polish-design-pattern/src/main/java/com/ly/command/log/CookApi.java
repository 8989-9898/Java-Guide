package com.ly.command.log;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.orderdishes
 * @ClassName: CookApi
 * @Author: lin
 * @Description: 厨师接口（接受者接口）
 * @Date: 2019/8/3 15:33
 * @Version: 1.0
 */
public interface CookApi {

    /**
     * 做菜的方法
     * @param num 桌号
     * @param name 菜名
     */
    public void cook(int num, String name);
}
