package com.ly.visitor.pattern;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.pattern
 * @ClassName: Visitor
 * @Author: lin
 * @Description: 访问者的接口，为所有的访问者对象申明一个visit方法
 * @Date: 2019/8/17 14:48
 * @Version: 1.0
 */
public interface Visitor {

    /**
     *访问元素 A，相当于给元素A添加访问者的功能
     * @param a 元素 B 的对象
     */
    public void visitConcreteElementA(ConcreteElementA a);

    /**
     * 访问元素 B，相当于给元素B添加访问者的功能
     * @param b 元素 B 的对象
     */
    public void visitConcreteElementB(ConcreteElementB b);



}
