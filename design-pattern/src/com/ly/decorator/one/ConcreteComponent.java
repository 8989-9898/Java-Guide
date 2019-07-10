package com.ly.decorator.one;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator
 * @ClassName: ConcreteComponent
 * @Author: lin
 * @Description: 定义具体的对象，可以对这个对象动态的添加一些职责
 * @Date: 2019-07-08 8:49
 * @Version: 1.0
 */
public class ConcreteComponent implements Component{

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
