package com.ly.composite.composite;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.composite.composite
 * @ClassName: Leaf
 * @Author: lin
 * @Description: 叶子对象，不包含其他的子对象
 * @Date: 2019/8/5 21:20
 * @Version: 1.0
 */
public class Leaf extends Compenet {

    /**
     * 该节点对象，没有子节点对象，直接输出
     */
    @Override
    public void someOperation() {
        System.out.println("this is leaf " + this);
    }
}
