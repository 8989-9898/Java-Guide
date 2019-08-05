package com.ly.composite.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.composite.composite
 * @ClassName: Compenet
 * @Author: lin
 * @Description: 抽象的组件对象，为组合中的对象申明接口，让客户端可以通过接口来访问和操作整个架构
 * @Date: 2019/8/5 20:57
 * @Version: 1.0
 */
public abstract class Compenet {

    /**
     * 示意方法，子组件对象可能有的功能方法
     */
    public abstract void printStruct(String prestr);

    /**
     * 向组合对象中添加组合对象
     * @param child 被加入组合对象中的组件对象
     */
    public void addChild(Compenet child){
        // 缺省的实现，抛出异常，因为叶子节点没有这个功能
        // 或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持该操作");
    }

    /**
     * 从组合对象中移除某个组件对象
     * @param child 被移除的组件对象
     */
    public void removeChild(Compenet child){
        // 缺省的实现，抛出异常，因为叶子节点没有这个功能
        // 或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持该操作");
    }

    /**
     * 返回某个索引对应的组件对象
     * @param index 需要获取的组件对象的索引，从 0 开始
     * @return 索引对应的组件对象
     */
    public Compenet getChildren(int index){
        // 缺省的实现，抛出异常，因为叶子节点没有这个功能
        // 或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持该操作");
    }

}
