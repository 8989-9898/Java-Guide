package com.ly.factorymethod.factorymethod;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.factorymethod
 * @ClassName: ConcreteCreater
 * @Author: lin
 * @Description: 工厂方法的继承类，创建具体的 Product 的实现子类
 * @Date: 2019-07-23 16:04
 * @Version: 1.0
 */
public class ConcreteCreater extends Creater {
    @Override
    protected Producct factoryMethod() {
        return new ConcreteProduct();
    }
}
