package com.ly.visitor.visitor;

import com.ly.visitor.visitor.Visitor;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor
 * @ClassName: Element
 * @Author: lin
 * @Description: Element类定义一个accept操作
 * @Date: 2019-07-16 9:07
 * @Version: 1.0
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
