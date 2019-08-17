package com.ly.visitor.component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.component
 * @ClassName: Composite
 * @Author: lin
 * @Description: 组合对象，可以包含其他对象或者叶子对象
 * @Date: 2019/8/17 16:02
 * @Version: 1.0
 */
public class Composite extends Component {

    private List<Component> childs = new ArrayList<>(5);

    @Override
    public void accept(Visitor visitor) {
        // 回调访问者对象相应的方法
        visitor.visitComposite(this);
        // 循环子元素，让子元素也接受访问
        childs.forEach(e -> e.accept(visitor));
    }

    /**
     * 组件对象的名字
     */
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void addChild(Component child) {
        childs.add(child);
    }

    @Override
    public void removeChild(Component child) {
        childs.remove(child);
    }

    @Override
    public void getChildren(int index) {
        childs.get(index);
    }

    public String getName() {
        return name;
    }
}
