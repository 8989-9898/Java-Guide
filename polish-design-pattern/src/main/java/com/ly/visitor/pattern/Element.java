package com.ly.visitor.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.pattern
 * @ClassName: Element
 * @Author: lin
 * @Description: 被访问元素的接口
 * @Date: 2019/8/17 14:52
 * @Version: 1.0
 */
public abstract class Element {
    /**
     * 接受访问者的访问
     * @param visitor 访问者对象
     */
    public abstract void  accept(Visitor visitor);
}
