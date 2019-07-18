package com.ly.simplefactory.no_pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.no_pattern
 * @ClassName: Main
 * @Author: lin
 * @Description: 调用接口的客户端
 * @Date: 2019-07-18 9:09
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 接口的思想是“封装隔离”，而在客户端不仅知道了接口还知道了具体的实现类，违反了接口的“封装隔离”原则
         * 按照接口的“封装隔离”思想，在客户端应该只知道接口而不知道具体的实现类是谁
         * 下面使用模式的方式决绝该问题
         */
        Api api = new Impl();
        api.print("传入测试接口的数据");
    }
}
