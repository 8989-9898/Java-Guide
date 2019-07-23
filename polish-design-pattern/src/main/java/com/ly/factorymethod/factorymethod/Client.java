package com.ly.factorymethod.factorymethod;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.factorymethod
 * @ClassName: Client
 * @Author: lin
 * @Description: 工厂方法模式的例子
 * @Date: 2019-07-23 16:04
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Creater creater=new ConcreteCreater();
        creater.operate();
    }
}
