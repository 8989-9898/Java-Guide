package com.ly.visitor.now.component;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.component
 * @ClassName: Leaf
 * @Author: lin
 * @Description: 叶子对象
 * @Date: 2019/8/17 16:07
 * @Version: 1.0
 */
public class Leaf extends Component {
    @Override
    public void accept(Visitor visitor) {
        // 回调访问者对象相应的方法
        visitor.visitLeaf(this);
    }

    /**
     * 叶子对象的名字
     */
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
