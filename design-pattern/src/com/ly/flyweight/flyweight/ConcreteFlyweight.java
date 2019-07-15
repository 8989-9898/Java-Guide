package com.ly.flyweight.flyweight;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.flyweight
 * @ClassName: ConcreteFlyweight
 * @Author: lin
 * @Description: 共享的内部状态 添加存储空间
 * @Date: 2019/7/15 21:02
 * @Version: 1.0
 */
public class ConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体的 Flyweight：" + extrinsicstate);
    }
}
