package com.ly.abstractfactory.simple;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用简单工厂的实例
 * @Date: 2019-07-24 8:31
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建装机工程师
        ComputerEngineer engineer = new ComputerEngineer();
        // 客户告诉装机工程师需要的配件
        //engineer.makeComputer(1,1);
        engineer.makeComputer(1,2);

        /**
         * 存在问题，CPU和主板应该是相互配备的，但是现在是有客户自己选择的，会存在针脚数和孔槽数对不上的问题 如在选择时传入 1 和 2
         * 使用抽象工厂来解决这个问题，
         * 抽象工厂是定义一个产品族，规定好了需要创建的产品功能，具体的规格实现有子类处理
         * */
    }
}
