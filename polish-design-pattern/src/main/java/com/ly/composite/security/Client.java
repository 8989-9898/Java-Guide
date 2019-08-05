package com.ly.composite.security;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.composite.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用组合模式的服装层级树(安全性的实现)，就是讲操作子元素的操作定义到组件对象中，同时需要区分组件对象和子节点对象
 * @Date: 2019/8/5 21:27
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建根节点
        Composite root = new Composite("服装");
        // 创建其他的组合对象
        Composite composite1 = new Composite("男装");
        Composite composite2 = new Composite("女装");
        // 创建叶子节点
        Leaf leaf1 = new Leaf("衬衣");
        Leaf leaf2 = new Leaf("夹克");
        Leaf leaf3 = new Leaf("裙子");
        Leaf leaf4 = new Leaf("套装");
        // 添加组合节点
        root.addChild(composite1);
        root.addChild(composite2);


        // 添加叶子节点
        composite1.addChild(leaf1);
        composite1.addChild(leaf2);
        composite2.addChild(leaf3);
        composite2.addChild(leaf4);
        // 输出组合结构
        root.printStruct("");
    }
}
