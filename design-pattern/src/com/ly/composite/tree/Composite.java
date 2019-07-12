package com.ly.composite.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.composite.tree
 * @ClassName: Composite
 * @Author: lin
 * @Description: 枝节点，可以存储叶节点和子节点
 * @Date: 2019-07-12 15:05
 * @Version: 1.0
 */
public class Composite extends Component {

    private List<Component> children=new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
children.add(component);
    }

    @Override
    public void remove(Component component) {
children.remove(component);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        children.forEach((e)->e.display(depth+2));
    }
}
