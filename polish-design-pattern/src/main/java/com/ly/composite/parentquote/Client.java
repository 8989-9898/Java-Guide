package com.ly.composite.parentquote;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.composite.parentquote
 * @ClassName: Client
 * @Author: lin
 * @Description: 实现在删除一个组件对象的时候，将该组件对象的子对象转移到他的上级组件对象中去
 * @Date: 2019/8/5 21:49
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
// 创建根节点
        Compenet root = new Composite("服装");
        // 创建其他的组合对象
        Compenet composite1 = new Composite("男装");
        Compenet composite2 = new Composite("女装");
        // 创建叶子节点
        Compenet leaf1 = new Leaf("衬衣");
        Compenet leaf2 = new Leaf("夹克");
        Compenet leaf4 = new Leaf("套装");
        Compenet leaf3 = new Leaf("裙子");
        // 添加组合节点
        root.addChild(composite2);
        root.addChild(composite1);


        // 添加叶子节点
        composite1.addChild(leaf1);
        composite1.addChild(leaf2);
        composite2.addChild(leaf3);
        composite2.addChild(leaf4);
        // 输出组合结构
        root.printStruct("");

        System.out.println("在删除一个类别后---------------------------->");

        root.removeChild(composite1);

        root.printStruct("");
    }
}
