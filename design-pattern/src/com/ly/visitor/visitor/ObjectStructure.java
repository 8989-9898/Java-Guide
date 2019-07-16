package com.ly.visitor.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.visitor
 * @ClassName: ObjectStructure
 * @Author: lin
 * @Description: 对象结构类
 * @Date: 2019-07-16 9:11
 * @Version: 1.0
 */
public class ObjectStructure {
    private List<Element> list = new ArrayList<>();

    public void attach(Element element) {
        list.add(element);
    }

    public void detach(Element element) {
        list.remove(element);
    }

    public void display(Visitor visitor) {
        list.forEach((e) -> {
            e.accept(visitor);
        });
    }

}
