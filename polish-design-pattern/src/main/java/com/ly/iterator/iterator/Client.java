package com.ly.iterator.iterator;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.iterator.iterator
 * @ClassName: Client
 * @Author: lin
 * @Description: 测试使用数组的迭代器模式
 * @Date: 2019/8/4 16:39
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        String[] strings = new String[]{"张三", "李四", "王五", "赵六"};
        // 创建聚合对象
        Aggregate aggregate = new ConcreteAggregate(strings);
        // 通过聚合对象，创建迭代器对象
        Iterator iterator = aggregate.createIterator();

        // 首先迭代到第一个元素
        iterator.first();
        // 循环迭代输出
        while (!iterator.isDone()) {
            // 获取当前元素输出
            System.out.println(iterator.currentItem());
            // 迭代下一个元素
            iterator.next();
        }
    }

    /**
     * 迭代器模式的优点：
     *      更好的封装性
     *      迭代器模式可以让你访问一个聚合对象的内容，而无需暴露该聚合对象的内部表示，从而提供聚合对象的封装性。
     *      可以以不同的方式来遍历一个聚合对象
     *      使用迭代器模式，使得聚合对象和具体的迭代算法分离开。这样可以实现不同的迭代器事例、不同的遍历方法来
     *      遍历同一个聚合对象。
     *      迭代器模式简化了聚合对象。
     *      有了迭代器的接口，则聚合本身就不需要在定义这些接口了，从而简化的聚合的接口定义。
     *      简化客户端调用。
     *      迭代器模式为遍历不同的聚合对象提供了一个统一的接口，是的客户端遍历聚合对象的内容更简单。
     *      同一个聚合对象上可以有多个遍历。
     *      每个迭代器保持它自己的状态，比如迭代时的索引位置，因此可以同一个聚合对象同时进行多个遍历
     *
     * 迭代器模式的本质：控制访问聚合对象中得的元素。
     * */
}
