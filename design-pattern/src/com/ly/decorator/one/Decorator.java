package com.ly.decorator.one;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator
 * @ClassName: Decorator
 * @Author: lin
 * @Description: 定义装饰的抽象类
 * @Date: 2019-07-08 8:51
 * @Version: 1.0
 */
public class Decorator implements Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * 重写 operation 方法，实际上调用的是 component 的 operation方法
     */
    @Override
    public void operation() {
        if (component!=null) {
            component.operation();
        }
    }
}
