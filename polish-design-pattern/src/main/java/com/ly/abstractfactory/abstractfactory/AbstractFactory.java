package com.ly.abstractfactory.abstractfactory;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.abstractfactory
 * @ClassName: AbstractFactory
 * @Author: lin
 * @Description: 抽象工厂的接口，声明创建抽象产品的操作
 * @Date: 2019-07-24 9:43
 * @Version: 1.0
 */
public interface AbstractFactory {

    /**
     * 创建抽象产品 A 的对象
     * @return
     */
    public AbstractProductA createProductA();

    /**
     * 创建抽象产品 B 的对象
     * @return
     */
    public AbstractProductB createProductB();
}
