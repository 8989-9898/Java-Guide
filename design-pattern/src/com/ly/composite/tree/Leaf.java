package com.ly.composite.tree;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.composite.tree
 * @ClassName: Leaf
 * @Author: lin
 * @Description: 叶节点表示没有下级节点了
 * @Date: 2019-07-12 14:59
 * @Version: 1.0
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("没有添加的子节点");
    }

    @Override
    public void remove(Component component) {
        System.out.println("没有删除的子节点");
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
