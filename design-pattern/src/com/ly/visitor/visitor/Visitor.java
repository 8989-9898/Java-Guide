package com.ly.visitor.visitor;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.visitor
 * @ClassName: Visitor
 * @Author: lin
 * @Description: 为对象结构中的ConcreteElement的每一个类申明一个Visit操作
 * @Date: 2019-07-16 9:04
 * @Version: 1.0
 */
public abstract class Visitor {
    public abstract void VisitConcreteElementA(ConcreteElementA a);
    public abstract void VisitConcreteElementB(ConcreteElementB b);
}
