package com.ly.composite.composite;

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
public class Composite extends Compenet{

    /**
     * 用来保存组件对象中的子组件对象
     */
    private List<Compenet> childs=null;

    @Override
    public void addChild(Compenet child) {
        // 延迟加载
        if (childs==null) {
            childs=new ArrayList<>();
        }
        // 加入
        childs.add(child);
    }

    @Override
    public void removeChild(Compenet child) {
        if (childs!=null) {
            childs.remove(child);
        }
    }

    @Override
    public Compenet getChildren(int index) {
        if (childs!=null) {
            if (index>=0 && index<childs.size()) {
                return childs.get(index);
            }
        }
        return null;
    }

    /**
     * 打印输出，组合对象的结构，通常使用递归
     */
    @Override
    public void someOperation() {
        if (childs!=null) {
            for (Compenet child : childs) {
                // 进行递归调用
                child.someOperation();
            }
        }
    }
}
