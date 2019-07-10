package com.ly.decorator.one;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.one
 * @ClassName: ConcreteComponentA
 * @Author: lin
 * @Description: 第一个装饰对象
 * @Date: 2019-07-08 8:59
 * @Version: 1.0
 */
public class ConcreteComponentA extends Decorator{

    @Override
    public void operation() {
        super.operation();
        System.out.println("进入第一个 ConcreteComponentA 的装饰中");
    }
}
