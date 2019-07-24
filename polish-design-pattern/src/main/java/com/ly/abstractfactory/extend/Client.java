package com.ly.abstractfactory.extend;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.extend
 * @ClassName: Client
 * @Author: lin
 * @Description: 扩展抽象工厂模式，使其变得容易扩展
 * @Date: 2019-07-24 10:20
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建具体的装机工程师
        ComputerEngineer engineer = new ComputerEngineer();
        // 客户选择的具体的装机类型
        //AbstractFactory schema = new Schema1();
        AbstractFactory schema = new Schema3();
        // 装机工程师开始装机
        engineer.makeComputer(schema);
    }

    /**
     * 在将抽象工厂修改后将变得可以灵活的扩展了 如：添加一个实现内存的方案三，只需要添加内存的接口、具体的内存实现类和具体的方案接口
     *
     * 这种方式虽然方便扩展但是不太安全
     * */
}
