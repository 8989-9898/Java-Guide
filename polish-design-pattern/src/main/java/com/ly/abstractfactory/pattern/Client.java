package com.ly.abstractfactory.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用抽象工厂改善简单工厂的实例
 * @Date: 2019-07-24 10:08
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建具体的装机工程师
        ComputerEngineer engineer = new ComputerEngineer();
        // 客户选择的具体的装机类型
        AbstractFactory schema1 = new Schema1();
        // 装机工程师开始装机
        engineer.makeComputer(schema1);
    }

    /**
     * CPU和主板是相关的对象，是构建电脑的一系列组件，这个抽象工厂就相当于一套装机方案，客户选择的时候，
     * 一选就是一套，CPU和主板是确定好的，不让客户分开选择，这就避免了出现不配备的问题
     * */
}
