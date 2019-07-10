package com.ly.decorator.one;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.one
 * @ClassName: ConcreteComponentB
 * @Author: lin
 * @Description: 第二个装饰对象
 * @Date: 2019-07-08 9:00
 * @Version: 1.0
 */
public class ConcreteComponentB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.println("进入第二个 ConcreteComponentB 的装饰中");
    }
}
