package com.ly.composite.circularquote;


import jdk.nashorn.internal.ir.IfNode;

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

    @Override
    public String getName() {
        return name;
    }

    /**
     * 打印输出，组合对象的结构，通常使用递归
     */
    @Override
    public void printStruct(String preStr) {
        if (childs != null) {
            // 首先输出自身
            System.out.println(preStr + "+" + this.name);
            // 该子集多加一个空格
            preStr += " ";
            // 输出其他的子集组合对象
            for (Compenet child : childs) {
                child.printStruct(preStr);
            }
        }

    }

    /**
     * 一个子节点的添加方法代替了之前的两个添加子节点的方法
     *
     * @param child 被加入组合对象中的组件对象
     */
    @Override
    public void addChild(Compenet child) {
        // 延迟加载
        if (childs == null) {
            childs = new ArrayList<>();
        }
        // 加入
        childs.add(child);

        // 先判断路径是否为空，为空说明是根节点
        if (getCompenentPath() == null || getCompenentPath().trim().length() == 0) {
            // 将本组件的名字设置到路径中
            setCompenentPath(name);
        }
        // 判断要加入的组件是否在路径上出现过
        // 先判断是否是根路径
        if (getCompenentPath().startsWith(child.getName() + ".")) {
            throw new IllegalArgumentException("在本通道上，组件" + child.getName() + "已经添加过了");
        } else {
            if (getCompenentPath().indexOf("." + child.getName()) < 0) {
                // 说明没有添加过，添加到该路径中
                child.setCompenentPath(this.getCompenentPath() + "." + child.getName());
            } else {
                throw new IllegalArgumentException("在本通道上，组件" + child.getName() + "已经添加过了");
            }
        }
    }

    @Override
    public void removeChild(Compenet child) {
        if (childs != null) {
            childs.remove(child);
        }
    }

    @Override
    public Compenet getChildren(int index) {
        if (childs != null) {
            if (index >= 0 && index < childs.size()) {
                return childs.get(index);
            }
        }
        return null;
    }
}
