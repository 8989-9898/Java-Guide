package com.ly.composite.security;


import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.composite.composite
 * @ClassName: Composite
 * @Author: lin
 * @Description: 组合对象，通常需要存储子对象，定义与子对象的相关操作
 * @Date: 2019/8/5 21:13
 * @Version: 1.0
 */
public class Composite extends Compenet {

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    /**
     * 用来保存组件对象中的子组件对象
     * 使用组合模式将之前的两个集合变为一个
     */
    private List<Compenet> childs = null;

    /**
     * 打印输出，组合对象的结构，通常使用递归
     */
    @Override
    public void printStruct(String preStr) {
        if (childs != null) {
            // 首先输出自身
            System.out.println(preStr+"+"+this.name);
            // 该子集多加一个空格

            preStr+=" ";
            // 输出其他的子集组合对象
            for (Compenet child : childs) {
                child.printStruct(preStr);
            }
        }

    }

    /**
     * 一个子节点的添加方法代替了之前的两个添加子节点的方法
     * @param child 被加入组合对象中的组件对象
     */
    public void addChild(Compenet child) {
        // 延迟加载
        if (childs == null) {
            childs = new ArrayList<>();
        }
        // 加入
        childs.add(child);
    }

    public void removeChild(Compenet child) {
        if (childs != null) {
            childs.remove(child);
        }
    }

    public Compenet getChildren(int index) {
        if (childs != null) {
            if (index >= 0 && index < childs.size()) {
                return childs.get(index);
            }
        }
        return null;
    }
}
