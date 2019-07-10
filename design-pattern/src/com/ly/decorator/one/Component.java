package com.ly.decorator.one;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator
 * @ClassName: Component
 * @Author: lin
 * @Description: 定义一个装饰接口
 * @Date: 2019-07-08 8:46
 * @Version: 1.0
 */
public interface Component {

    /**
     * 可以给这些对象动态的添加职责
     */
    void operation();
}
