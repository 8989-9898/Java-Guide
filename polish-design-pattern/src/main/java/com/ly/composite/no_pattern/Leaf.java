package com.ly.composite.no_pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.composite.no_pattern
 * @ClassName: Leaf
 * @Author: lin
 * @Description: 叶子节点
 * @Date: 2019/8/5 19:50
 * @Version: 1.0
 */
public class Leaf {

    /**
     * 叶子节点名称
     */
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    /**
     * 输出叶子对象的结构，就是输出叶子节点的名称，因为叶子节点没有下级
     * @param preStr 缩进空格
     */
    public void printStruct(String preStr){
        System.out.println(preStr+"-"+name);
    }

}
