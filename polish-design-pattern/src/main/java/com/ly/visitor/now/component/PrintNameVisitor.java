package com.ly.visitor.now.component;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.component
 * @ClassName: PrintNameVisitor
 * @Author: lin
 * @Description: 具体的访问者的实现，输出对象组合的结构
 * @Date: 2019/8/17 16:09
 * @Version: 1.0
 */
public class PrintNameVisitor implements Visitor {

    private String string = "";

    @Override
    public void visitComposite(Composite composite) {
        // 先将自己输出，
        System.out.println(string + "+" + composite.getName());
        // 如果还包含有子对象，那么向后退后一个空格。
        string += " ";
        for (Component component : composite.getChildren()) {
            // 递归输出每个子对象
            component.accept(this);
        }
        // 把循环子对象多加入空格去掉
        string = string.substring(0, string.length() - 1);
    }

    @Override
    public void visitLeaf(Leaf leaf) {
        System.out.println(string + "-" + leaf.getName());
    }
}
