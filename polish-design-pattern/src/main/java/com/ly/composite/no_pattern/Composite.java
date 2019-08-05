package com.ly.composite.no_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.composite.no_pattern
 * @ClassName: Composite
 * @Author: lin
 * @Description: 组合对象，可以包含叶子对象也可以包含其他的组合对象
 * @Date: 2019/8/5 19:54
 * @Version: 1.0
 */
public class Composite {

    /**
     * 该组合对象的子集组合对象
     */
    private List<Composite> childs=new ArrayList<>();

    /**
     * 该组合对象的叶子节点
     */
    private List<Leaf> childLeaf=new ArrayList<>();


    /**
     * 当前对象的名字
     */
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    /**
     * 添加其他的组合对象
     * @param composite
     */
    public void addComposite(Composite composite){
        childs.add(composite);
    }

    /**
     * 添加叶子对象
     * @param leaf
     */
    public void addLeaf(Leaf leaf){
        childLeaf.add(leaf);
    }

    /**
     * 输出组合对象的结构
     * @param preStr
     */
    public void printStruct(String preStr){
        // 首先输出自身
        System.out.println(preStr+"+"+this.name);
        // 该子集多加一个空格
        preStr+=" ";
        // 先迭代输出叶子节点
        for (Leaf leaf : childLeaf) {
            leaf.printStruct(preStr);
        }
        // 输出其他的子集组合对象
        for (Composite child : childs) {
            child.printStruct(preStr);
        }
    }

}
