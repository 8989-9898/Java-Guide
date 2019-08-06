package com.ly.template.template;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.template
 * @ClassName: AbstractClass
 * @Author: lin
 * @Description: 模板方法模式中的模板类，定义模板方法，和源语操作等的抽象类
 * @Date: 2019-08-06 16:24
 * @Version: 1.0
 */
public abstract class AbstractClass {

    /**
     * 定义源语操作，由子类实现
     */
    public abstract void doPrimitiveOperation1();

    /**
     * 定义源语操作，由子类实现
     */
    public abstract void doPrimitiveOperation2();

    /**
     * 模板方法，定义算法骨架
     */
    public final void templateMethod(){
        doPrimitiveOperation1();
        doPrimitiveOperation2();
    }
}
