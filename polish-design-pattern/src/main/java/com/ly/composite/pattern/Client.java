package com.ly.composite.pattern;

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
        Compenet composite2 = new Composite("女装");
        // 创建叶子节点
        Compenet leaf1 = new Leaf("衬衣");
        Compenet leaf2 = new Leaf("夹克");
        Compenet leaf3 = new Leaf("裙子");
        Compenet leaf4 = new Leaf("套装");
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

    /**
     * 组合模式的优点：
     *      定义了包含基本对象和组合对象的层次结构：在组合模式中，基本对象可以被组合成复杂的组合对象,而组合对象又可以组合成
     *      更复杂的组合对象，可以不断的递归下去，从而构成一个同一个组合对象的类层次结构。
     *      同一了解组合对象和叶子对象：在组合模式中可以吧叶子对象看作特殊的组合对象，为它们定义同一的父类，从而把叶子对象和
     *      组合对象的行为同一起来。
     *      简化了客户端调用：组合模式通过同一组合对象和叶子对象，使得客户端在使用他们的时候，不需要再去区分它们，客户不关心
     *      使用的到底是什么类型的对象，这就大大的简化了客户端的操作使用。
     *      更容易扩展：由于客户端同一的对 Component操作，因此，新定义的Composite和Leaf很容易的与已有的结构一起工作，而
     *      客户端不需要因为添加了新的组件类而改变
     *
     * 组合模式的缺点：
     *      很难限制组件中的组件类型。
     *      容易增加新的组件也带来一些问题，比如很难限制组件中的类型。
     *      这在需要检测组件类型的时候，使得我们不能依靠编译期的类型约束来完成，必须在运行期动态检测。
     *
     * 组合模式的本质是：统一叶子对象和组合对象。
     * */
}
