package com.ly.composite.composite;

import java.math.RoundingMode;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.composite
 * @ClassName: Cient
 * @Author: lin
 * @Description: 组合模式的事例
 * @Date: 2019/8/5 20:56
 * @Version: 1.0
 */
public class Cient {
    public static void main(String[] args) {

        // 创建对个组件对象
        Compenet root = new Composite();
        Compenet com1 = new Composite();
        Compenet com2 = new Composite();

        // 创建多个叶子对象
        Compenet leaf1 = new Leaf();
        Compenet leaf2 = new Leaf();
        Compenet leaf3 = new Leaf();
        Compenet leaf4 = new Leaf();

        root.addChild(com1);
        root.addChild(com2);

        com1.addChild(leaf1);
        com1.addChild(leaf2);
        com2.addChild(leaf3);
        com2.addChild(leaf4);

        root.someOperation();

    }

}
