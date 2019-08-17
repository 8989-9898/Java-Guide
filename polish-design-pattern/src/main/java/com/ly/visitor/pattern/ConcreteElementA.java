package com.ly.visitor.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.pattern
 * @ClassName: ConcreteElementA
 * @Author: lin
 * @Description: 具体的元素实现
 * @Date: 2019-08-17 14:58
 * @Version: 1.0
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    /**
     * 表示元素特有的功能实现
     */
    public void operation() {
        System.out.println("A子类特有的方法");
    }
}
