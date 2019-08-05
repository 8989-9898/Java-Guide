package com.ly.composite.circularquote;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.composite.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用组合模式的服装层级树（透明性的实现）
 * @Date: 2019/8/5 21:27
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建根节点
        Compenet root = new Composite("服装");
        // 创建其他的组合对象
        Compenet composite1 = new Composite("男装");
        Compenet composite3 = new Composite("男装");
        Compenet composite2 = new Composite("女装");
        // 创建叶子节点
        Compenet leaf1 = new Leaf("衬衣");
        Compenet leaf2 = new Leaf("夹克");
        Compenet leaf3 = new Leaf("裙子");
        Compenet leaf4 = new Leaf("套装");
        // 添加组合节点
        root.addChild(composite1);
        composite1.addChild(composite2);
        composite2.addChild(composite3);


        // 添加叶子节点
        composite1.addChild(leaf1);
        composite1.addChild(leaf2);
        composite2.addChild(leaf3);
        composite2.addChild(leaf4);
        // 输出组合结构
        root.printStruct("");
    }
}
