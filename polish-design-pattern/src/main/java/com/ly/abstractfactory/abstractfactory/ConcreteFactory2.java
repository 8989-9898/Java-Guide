package com.ly.abstractfactory.abstractfactory;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.abstractfactory
 * @ClassName: ConcreteFactory1
 * @Author: lin
 * @Description: 具体的工厂实现, 创建第二种产品类型
 * @Date: 2019-07-24 9:51
 * @Version: 1.0
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
