package com.ly.visitor.visitor;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.visitor
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-16 9:14
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        ConcreteElementA a = new ConcreteElementA();
        structure.attach(a);
        a.operation();
        ConcreteElementB b = new ConcreteElementB();
        structure.attach(b);
        b.operation();

        structure.display(new ConcreteVisitor1());
        structure.display(new ConcreteVisitor2());
    }
}
