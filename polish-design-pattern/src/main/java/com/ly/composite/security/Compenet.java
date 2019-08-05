package com.ly.composite.security;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.composite.composite
 * @ClassName: Compenet
 * @Author: lin
 * @Description: 抽象的组件对象，为组合中的对象申明接口，让客户端可以通过接口来访问和操作整个架构
 * @Date: 2019/8/5 20:57
 * @Version: 1.0
 */
public abstract class Compenet {

    /**
     * 示意方法，子组件对象可能有的功能方法
     */
    public abstract void printStruct(String prestr);

}
