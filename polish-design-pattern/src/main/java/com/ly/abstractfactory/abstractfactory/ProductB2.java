package com.ly.abstractfactory.abstractfactory;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.abstractfactory
 * @ClassName: ProductA1
 * @Author: lin
 * @Description: B产品的第二种规格类型
 * @Date: 2019-07-24 9:48
 * @Version: 1.0
 */
public class ProductB2 implements AbstractProductB {
    @Override
    public void make() {
        System.out.println("创建 B 类型第二种产品和 A 类型的第二种产品对应");
    }
}
