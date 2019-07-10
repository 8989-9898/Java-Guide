package com.ly.factorymethod.program;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.program
 * @ClassName: Main
 * @Author: lin
 * @Description: 工厂方法模式解决了在简单工厂中的问题：就是 开放-封闭原则，在简单工厂中如果要添加新的算法实现就需要修改
 *               简单工厂的代码，违反了开放-封闭原则，而工厂方法则不会，在工厂方法中如需添加新的算法实现，只需要添加新的实现类实现
 *               OperationFactory接口就行了。实现的对修改关闭对扩展开发
 * @Date: 2019-07-08 10:45
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        OperationFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setNumberA(34);
        operation.setNumberB(23);
        System.out.println(operation.result());
    }
}
