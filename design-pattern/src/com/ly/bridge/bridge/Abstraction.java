package com.ly.bridge.bridge;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.bridge.bridge
 * @ClassName: Abstraction
 * @Author: lin
 * @Description:
 * @Date: 2019/7/13 17:56
 * @Version: 1.0
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
