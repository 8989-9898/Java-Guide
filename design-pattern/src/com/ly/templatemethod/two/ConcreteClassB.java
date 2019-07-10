package com.ly.templatemethod.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.templatemethod.two
 * @ClassName: ConcreteClassB
 * @Author: lin
 * @Description: 具体实现的子类B
 * @Date: 2019-07-09 15:36
 * @Version: 1.0
 */
public class ConcreteClassB extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("在子类B中的具体实现方法1");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("在子类B中的具体实现方法2");
    }
}
