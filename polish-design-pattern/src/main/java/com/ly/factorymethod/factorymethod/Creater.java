package com.ly.factorymethod.factorymethod;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.factorymethod
 * @ClassName: Creater
 * @Author: lin
 * @Description: 创建工厂方法的抽象类，用于创建Product接口的具体实现
 * @Date: 2019-07-23 15:57
 * @Version: 1.0
 */
public abstract class Creater {

    public void operate(){
        Producct producct=factoryMethod();
        // 使用钩子方法调用具体的子类实现
        producct.println();
    }

    protected abstract Producct factoryMethod();
}
