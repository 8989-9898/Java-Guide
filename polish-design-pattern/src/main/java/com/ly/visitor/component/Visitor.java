package com.ly.visitor.component;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.component
 * @ClassName: Visitor
 * @Author: lin
 * @Description: 访问组合对象结构的访问者接口
 * @Date: 2019/8/17 15:53
 * @Version: 1.0
 */
public interface Visitor {

    /**
     * 访问组合对象，相当于给组合对象添加访问者的功能
     * @param composite 组合对象
     */
    void visitComposite(Composite composite);

    /**
     * 访问叶子对象，相当于给组合对象添加访问者的功能
     * @param leaf 叶子对象
     */
    void visitLeaf(Leaf leaf);

}
