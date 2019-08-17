package com.ly.visitor.component;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.component
 * @ClassName: ObjectStructure
 * @Author: lin
 * @Description: 对象结构，通常在这里对元素对象进行遍历，让访问者能访问到所有的元素
 * @Date: 2019/8/17 16:12
 * @Version: 1.0
 */
public class ObjectStructure {

    /**
     * 表示根节点
     */
    private Component root=null;

    public void handleRequest(Visitor visitor){
        root.accept(visitor);
    }

    public void setRoot(Component root) {
        this.root = root;
    }
}
