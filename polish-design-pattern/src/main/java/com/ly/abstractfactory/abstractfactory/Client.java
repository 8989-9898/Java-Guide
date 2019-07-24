package com.ly.abstractfactory.abstractfactory;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.abstractfactory
 * @ClassName: Client
 * @Author: lin
 * @Description: 抽象工厂模式的 demo
 * @Date: 2019-07-24 9:42
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        factory.createProductA().make();
        factory.createProductB().make();
    }

    /**
     * AbstractFactory : 抽象工厂，定义创建一系列产品对象的操作接口
     *
     * ConcreteFactory : 具体的工厂，实现抽象工厂定义的方法，具体实现一系列产品对象的创建
     *
     * AbstractProduct : 定义一类产品对象的接口
     *
     * ConcreteProduct : 具体的产品实现对象，通常在具体工厂里面，会选择具体的产品实现对象，来创建符合抽象工厂定义的方法返回的产品类型的对象
     *
     * Client : 客户端，主要使用抽象工厂来获取一些列所需要的产品对象，然后面向这些产品对象的接口编程，以实现需要的功能
     *
     * 抽象工厂模式
     *      优点：
     *          分离接口和实现：客户端使用抽象工厂来创建所需的对象，而客户端根本不知道具体的实现是谁，客户端只是面向产品接口编程而已。客户端和具体的产品实现分离
     *
     *          使得切换产品变得更加容易：因为一个具体的工厂实现就代表一个具体的产品，只需要切换具体的工厂实现就可以切换具体的产品。
     *
     *      缺点：
     *          不太容易扩展新的产品：如给产品族添加一个新的产品，那么就要修改抽象工厂，一修改抽象工厂就需要修改所有的抽象工厂实现类。
     *
     *          容易造成层次复杂：在使用抽象工厂的时候，如果需要选择的层次过多，那么会造成整个类层次变的复杂。如：在使用 DAO 层的接口时，如果将关系型数据库
     *          在进行细分Oracle、DB2、MySQL等实现时。客户端就要一层一层的选择。也就是抽象工厂的实现也需要分出层次来，每一层一种选择，也就是一层屏蔽一种变化，
     *          这样很容易造成复杂的类层次结构
     *
     * 抽象工厂模式的本质是：选择产品族的实现。
     *
     * 工厂方法是选择单个产品的实现，虽然一个类里面可以有多个工厂方法，但是这些方法之间是没有联系的。
     * */
}
