package com.ly.composite.no_pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.composite.no_pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 不使用的模式的组合构造数
 * @Date: 2019/8/5 20:13
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建根节点
        Composite composite = new Composite("服装");
        // 创建其他的组合对象
        Composite composite1 = new Composite("男装");
        Composite composite2 = new Composite("女装");
        // 创建叶子节点
        Leaf leaf1 = new Leaf("衬衣");
        Leaf leaf2 = new Leaf("夹克");
        Leaf leaf3 = new Leaf("裙子");
        Leaf leaf4 = new Leaf("套装");
        // 添加组合节点
        composite.addComposite(composite1);
        composite.addComposite(composite2);


        // 添加叶子节点
        composite1.addLeaf(leaf1);
        composite1.addLeaf(leaf2);
        composite2.addLeaf(leaf3);
        composite2.addLeaf(leaf4);
        // 输出组合结构
        composite.printStruct("");
    }

    /**
     * 不使用模式时需要注意区分组合对象和叶子对象，不易于扩展
     * */
}
