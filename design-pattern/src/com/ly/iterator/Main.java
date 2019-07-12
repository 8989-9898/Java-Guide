package com.ly.iterator;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.iterator
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-12 17:14
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        ConcreteAggregate c = new ConcreteAggregate();
        c.set("A");
        c.set("B");
        c.set("C");
        c.set("D");
        c.set("E");

        System.out.println("从前往后迭代");
        Iterator iterator = new ConcreteIterator(c);
        Object first = iterator.first();
        while (!iterator.isDone()) {
            System.out.println(iterator.CurrentItem());
            iterator.next();
        }

        System.out.println("从后往前迭代");
        Iterator desc = new ConcreteIteratorDesc(c);
        Object first1 = desc.first();
        while (desc.isDone()) {
            System.out.println(desc.CurrentItem());
            desc.next();
        }
    }
}
