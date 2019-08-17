package com.ly.visitor.pattern;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.pattern
 * @ClassName: ConcreteVisitor1
 * @Author: lin
 * @Description: 具体的操作1
 * @Date: 2019-08-17 14:58
 * @Version: 1.0
 */
public class ConcreteVisitor1 implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA a) {
        System.out.println(a.getClass().getSimpleName() + "被" + this.getClass().getSimpleName() + "访问");
        a.operation();
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB b) {
        System.out.println(b.getClass().getSimpleName() + "被" + this.getClass().getSimpleName() + "访问");
        b.operation();
    }

}
