package com.ly.templatemethod.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.templatemethod.two
 * @ClassName: AbstractClass
 * @Author: lin
 * @Description: 定义一个模板方法类，实现了一个模板
 * @Date: 2019-07-09 15:31
 * @Version: 1.0
 */
public abstract class AbstractClass {

    public void template(){
        // 在该模板中调用抽象方法,具体的实现在子类中
        primitiveOperation1();
        primitiveOperation2();
    }

    /**
     * 定义了两个抽象方法，将特定的实现放到子类中
     */
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();
}
