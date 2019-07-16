package com.ly.visitor.person;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.person
 * @ClassName: Main
 * @Author: lin
 * @Description: 访问者模式（Visitor）：表示一个作用于某个对象结构中的各元素的操作。它使你可以在不改变个元素的类的前提下定义作用于这些类元素的新操作
 *               访问者模式适用于数据结构相对稳定的系统。相对于一下的操作，person的类型就特别的稳定，只会有 Man 和 Woman 两个类型，如果是其他的不稳定的类型
 *               需要在已经固定的 Visitor 中添加新的状态就需要修改非常多的子类，违反了 开放-封闭原则。
 *               访问者模式的作用是将处理从数据结构中抽离出来。
 * @Date: 2019-07-16 8:46
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Woman());

        structure.display(new Success());
        structure.display(new Failing());
        structure.display(new Amativeness());
        structure.display(new Marriage());
    }
}
