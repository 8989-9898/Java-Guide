package com.ly.simplefactory.no_pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.no_pattern
 * @ClassName: Impl
 * @Author: lin
 * @Description: 对接口的实现
 * @Date: 2019-07-18 9:07
 * @Version: 1.0
 */
public class Impl implements Api {
    @Override
    public void print(String s) {
        System.out.println("New In Impl. The input s = " +s);
    }
}
