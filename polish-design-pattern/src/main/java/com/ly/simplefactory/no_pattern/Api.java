package com.ly.simplefactory.no_pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.no_pattern
 * @ClassName: Api
 * @Author: lin
 * @Description: 不使用模式的接口调用时的接口
 *               某个接口（通用的、抽象的、非具体的实现）
 * @Date: 2019-07-18 9:04
 * @Version: 1.0
 */
public interface Api {
    /**
     * 某个具体的功能方法的定义，用print来演示
     * 将传入的参数 s 打印出来
     * @param s
     */
    void print(String s);
}
