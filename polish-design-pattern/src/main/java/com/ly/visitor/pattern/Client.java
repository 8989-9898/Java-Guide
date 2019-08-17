package com.ly.visitor.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 访问者模式的简单事例
 * @Date: 2019/8/17 15:08
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建 ObjectStructure
        ObjectStructure structure = new ObjectStructure();

        // 创建要加入对象结构的元素
        Element a = new ConcreteElementA();
        Element b = new ConcreteElementB();

        // 把元素加入对象结构
        structure.addElement(a);
        structure.addElement(b
        );

        // 创建访问者对象
        Visitor visitor1 = new ConcreteVisitor1();
        // 调用业务处理方法
        structure.handleRequest(visitor1);
        structure.handleRequest(new ConcreteVisitor2());
    }

    /**
     *
     * 访问者模式的优点：
     *      好的扩展性：能够在不修改对象结构中的元素的情况下，为对象结构中的元素添加新的功能。
     *      好的复用性：可以通过访问者来定义整个对象结构通用的功能，从而提高复用程度。
     *      分离乌无关行为：可以通过访问者来分离无关的行为，把相关的行为封装在一起，构成一个
     *      访问者对象，这样每一个访问者对象的功能都比较单一。
     *
     * 访问者模式的缺点：
     *      对象结构变化困难：不适合用于对象结构中的类经常变化的情况，因为对象结构发生了改变，
     *      访问的接口和访问者的实现都要发生相应的改变，代价太高。
     *      破坏封装：访问者模式通常需要对象结构开发内部数据给访问者和ObjectStructure，这
     *      破坏了对象的封装性。
     *
     * 访问者模式的本质是：预留通道，回调实现。
     *
     *
     * */
}
