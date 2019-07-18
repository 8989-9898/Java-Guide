package com.ly.simplefactory.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.pattern
 * @ClassName: ImplA
 * @Author: lin
 * @Description: 接口的实现对象A
 * @Date: 2019-07-18 9:16
 * @Version: 1.0
 */
public class ImplA implements Api {


    @Override
    public void println(String s) {
        // 实现功能的代码
        System.out.println("this ImplA s = "+ s);
    }
}
