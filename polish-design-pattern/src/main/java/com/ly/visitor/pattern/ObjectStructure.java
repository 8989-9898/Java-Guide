package com.ly.visitor.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.pattern
 * @ClassName: ObjectStructure
 * @Author: lin
 * @Description: 对象结构，通常在这里对元素对象进行遍历，让访问者能访问到所有的元素
 * @Date: 2019/8/17 15:02
 * @Version: 1.0
 */
public class ObjectStructure {

    /**
     * 表示对象结构，可以是一个组合对象或者集合
     */
    private List<Element> list=new ArrayList<>(5);

    /**
     * 提供给客户端操作的高层接口
     * @param visitor  客户端需要使用的访问者
     */
    public void handleRequest(Visitor visitor){
        // 循环对象结构中的元素，接收访问
        list.forEach(e->e.accept(visitor));
    }

    /**
     * 组建对象结构，向对象结构中添加元素
     * 不同的对象结构有不同的构建方式
     * @param element 加入到对象结构中的元素
     */
    public void addElement(Element element){
        this.list.add(element);
    }

}
