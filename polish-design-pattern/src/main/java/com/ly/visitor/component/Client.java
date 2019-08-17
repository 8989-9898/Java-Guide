package com.ly.visitor.component;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.component
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用访问者模式代替组合模式的功能
 * @Date: 2019/8/17 16:15
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建根节点
        Component composite = new Composite("服装");
        // 创建其他的组合对象
        Component composite1 = new Composite("男装");
        Component composite2 = new Composite("女装");
        // 创建叶子节点
        Component leaf1 = new Leaf("衬衣");
        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("裙子");
        Component leaf4 = new Leaf("套装");
        // 添加组合节点
        composite.addChild(composite1);
        composite.addChild(composite2);


        // 添加叶子节点
        composite1.addChild(leaf1);
        composite1.addChild(leaf2);
        composite2.addChild(leaf3);
        composite2.addChild(leaf4);
        // 输出组合结构
        ObjectStructure structure = new ObjectStructure();
        structure.setRoot(composite);
        structure.handleRequest(new PrintNameVisitor());
    }
}
