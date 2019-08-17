package com.ly.visitor.now.component;

import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.component
 * @ClassName: Component
 * @Author: lin
 * @Description: 抽象的组件对象，相当于访问者模式中的元素
 * @Date: 2019/8/17 15:56
 * @Version: 1.0
 */
public abstract class Component {


    /**
     * 接受访问者的访问
     * @param visitor 访问者
     */
    public abstract void accept(Visitor visitor);


    /**
     * 向组合对象中添加组件对象
     * @param child 被加入的组件对象
     */
    public void addChild(Component child){
        // 默认的实现，抛出例外，叶子对象没有这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 从组合对象中移除的组件对象
     * @param child 被移除的组件对象
     */
    public void removeChild(Component child){
        // 默认的实现，抛出例外，叶子对象没有这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 返回某个索引对应的组件对象
     * @param index 索引
     */
    public void getChildren(int index){
        // 默认的实现，抛出例外，叶子对象没有这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 获取聚合对象
     */
    public List<Component> getChildren(){
        // 默认的实现，抛出例外，叶子对象没有这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
}
