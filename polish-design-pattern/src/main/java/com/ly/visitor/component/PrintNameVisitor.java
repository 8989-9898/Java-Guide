package com.ly.visitor.component;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.component
 * @ClassName: PrintNameVisitor
 * @Author: lin
 * @Description: 具体的访问者的实现，
 * 实现输出：对象的名称，在组合对象前添加 “节点：” 在叶子对象前添加 “叶子”
 * @Date: 2019/8/17 16:09
 * @Version: 1.0
 */
public class PrintNameVisitor implements Visitor {

    @Override
    public void visitComposite(Composite composite) {
        System.out.println("节点：" + composite.getName());
    }

    @Override
    public void visitLeaf(Leaf leaf) {
        System.out.println("叶子：" + leaf.getName());
    }
}
