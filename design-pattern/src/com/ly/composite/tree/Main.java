package com.ly.composite.tree;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.composite.tree
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-12 15:09
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite composite_x = new Composite("Composite X");
        composite_x.add(new Leaf("Leaf XA"));
        composite_x.add(new Leaf("Leaf XB"));

        Composite composite_y = new Composite("Composite Y");
        composite_y.add(new Leaf("Leaf YA"));
        composite_y.add(new Leaf("Leaf YB"));
        composite_x.add(composite_y);

        root.add(composite_x);
        root.add(composite_x);
        root.add(new Leaf("Leaf C"));
        root.add(new Leaf("Leaf D"));

        root.display(1);
    }
}
