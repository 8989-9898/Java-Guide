package com.ly.builder.builder;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.builder.builder
 * @ClassName: ConcreteProduct
 * @Author: lin
 * @Description: 某种产品部件
 * @Date: 2019/7/27 15:59
 * @Version: 1.0
 */
public class ConcreteProduct implements Product{


    @Override
    public void test() {
        System.out.println("执行某种产品部件");
    }
}
