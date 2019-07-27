package com.ly.builder.builder;



/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.builder.builder
 * @ClassName: Client
 * @Author: lin
 * @Description: ${DESCRIPTION}
 * @Date: 2019/7/27 15:57
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder(new ConcreteProduct()));
        director.constract();
    }
}
