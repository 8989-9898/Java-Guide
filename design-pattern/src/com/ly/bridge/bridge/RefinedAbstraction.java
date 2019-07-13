package com.ly.bridge.bridge;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.bridge.bridge
 * @ClassName: RefinedAbstraction
 * @Author: lin
 * @Description:
 * @Date: 2019/7/13 17:58
 * @Version: 1.0
 */
public class RefinedAbstraction extends Abstraction{
    @Override
    public void operation() {
        implementor.Operation();
    }
}
