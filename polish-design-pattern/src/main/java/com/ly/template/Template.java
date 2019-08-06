package com.ly.template;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template
 * @ClassName: Template
 * @Author: lin
 * @Description: 一个较为具体的模板方法类
 * @Date: 2019-08-06 17:17
 * @Version: 1.0
 */
public abstract class Template {

    /**
     * 模板方法，定义算法骨架
     */
    public final void templateMethod() {
        this.operation1();
        this.operation2();
        this.doPrimitiveOperation1();
        this.doPrimitiveOperation2();
        this.hookOperation();
    }


    /**
     * 具体操作一，算法中的步骤，固定的实现，而且子类不需要访问
     */
    private final void operation1() {
        System.out.println("具体操作一，算法中的步骤，固定的实现，而且子类不需要访问");
    }

    /**
     * 具体操作二、算法中的步骤，固定的实现，而且子类可能需要访问
     * 不可以被覆盖
     */
    protected final void operation2() {
        System.out.println("具体操作二，算法中的步骤，固定的实现，而且子类可能需要访问");
    }

    /**
     * 具体的 模板方法的操作，子类的公共功能，但通常不是具体的算法步骤
     */
    protected void commonOperation() {
        System.out.println("具体的 模板方法的操作，子类的公共功能，但通常不是具体的算法步骤");
    }

    /**
     * 原语操作一、算法中的必要步骤，父类无法确定如何真正实现，需要子类来实现
     */
    protected abstract void doPrimitiveOperation1();

    /**
     * 原语操作二、算法中的必要步骤，父类无法确定如何真正实现，需要子类来实现
     */
    protected abstract void doPrimitiveOperation2();

    /**
     * 钩子方法，算法中的步骤，不一定需要，提供默认的实现
     */
    protected void hookOperation() {
        System.out.println("钩子方法，算法中的步骤，不一定需要，提供默认的实现");
    }

    /**
     * 工厂方法，创建某个对象，在这里使用 Object 代替 ，在算法实现中可能需要
     * @return
     */
    protected abstract Object createOneObject();
}
