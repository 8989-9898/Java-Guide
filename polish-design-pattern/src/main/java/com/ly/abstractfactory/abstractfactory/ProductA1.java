package com.ly.abstractfactory.abstractfactory;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.abstractfactory
 * @ClassName: ProductA1
 * @Author: lin
 * @Description: A产品的第一种规格类型
 * @Date: 2019-07-24 9:48
 * @Version: 1.0
 */
public class ProductA1 implements AbstractProductA {
    @Override
    public void make() {
        System.out.println("创建 A 类型第一种产品和 B 类型的第一种产品对应");
    }
}
