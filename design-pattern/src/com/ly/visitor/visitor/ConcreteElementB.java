package com.ly.visitor.visitor;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.visitor
 * @ClassName: ConcreteElementB
 * @Author: lin
 * @Description:
 * @Date: 2019-07-16 9:08
 * @Version: 1.0
 */
public class ConcreteElementB extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.VisitConcreteElementB(this);
    }

    public void operation(){
        System.out.println("子类特有的方法");
    }
}
