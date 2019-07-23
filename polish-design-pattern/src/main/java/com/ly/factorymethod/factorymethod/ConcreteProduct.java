package com.ly.factorymethod.factorymethod;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.factorymethod
 * @ClassName: ConcreteProduct
 * @Author: lin
 * @Description: 创建接口的具体的一种实现方式
 * @Date: 2019-07-23 15:56
 * @Version: 1.0
 */
public class ConcreteProduct implements Producct {
    @Override
    public void println() {
        System.out.println("具体的打印子类 ConcreteProduct ");
    }
}
