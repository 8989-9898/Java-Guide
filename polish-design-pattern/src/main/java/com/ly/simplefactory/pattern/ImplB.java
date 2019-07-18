package com.ly.simplefactory.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.pattern
 * @ClassName: ImplB
 * @Author: lin
 * @Description: 接口的实现对象B
 * @Date: 2019-07-18 9:17
 * @Version: 1.0
 */
public class ImplB implements Api {
    @Override
    public void println(String s) {
        // 功能的实现代码
        System.out.println("this ImplB s = " + s);
    }
}
