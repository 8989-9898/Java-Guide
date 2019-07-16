package com.ly.visitor.visitor;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.visitor
 * @ClassName: ConcreteVisitor1
 * @Author: lin
 * @Description: 具体的操作2
 * @Date: 2019-07-16 9:09
 * @Version: 1.0
 */
public class ConcreteVisitor2 extends Visitor {
    @Override
    public void VisitConcreteElementA(ConcreteElementA a) {
        System.out.println(a.getClass().getSimpleName()+"被"+this.getClass().getSimpleName()+"访问");
    }

    @Override
    public void VisitConcreteElementB(ConcreteElementB b) {
        System.out.println(b.getClass().getSimpleName()+"被"+this.getClass().getSimpleName()+"访问");

    }
}
