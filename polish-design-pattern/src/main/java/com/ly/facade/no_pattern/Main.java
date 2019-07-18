package com.ly.facade.no_pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.facade.no_pattern
 * @ClassName: Main
 * @Author: lin
 * @Description: 用于演示在不使用模式是的客户端调用
 * @Date: 2019/7/18 21:21
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        // 没有配置文件，使用默认的配置。直接生成三层
        // 在这种生成的情况下，需要客户端对这些模块都有了了解，才能正确的使用它们
        new Presentation().generate();
        new Business().generate();
        new Dao().generate();
    }

    /**
     * 在该种情况中存在问题就是
     * 1、客户端为了实现代码的生成功能，需要与生成代码的子系统内部的多个模块交互
     * 2、客户端需要了解到所需模块的具体功能实现，暴露了内部具体的实现
     * 使用外观模式可以解决以上出现的问题
     * 外观模式的定义
     *     为子系统中的一组接口提供一个一致的界面，Facade（外观模式）定义了一个高层接口，这个接口使得这一
     * 子系统更加容易使用。
     *     在以上所说的界面的意思是：从一个组件外部来看这个组件，能够看到什么，这就是这个组件的界面，也就是外观。
     * 比如从一个类外部来看这个类，那么这个类的 public 方法就是这个类的外观，因为你从这个类外部只能看到这些。
     * 也可以是一个模块对外提供的接口，这些接口也就是外观，因为模块的内部实现已经被隐藏起来了
     *     在以上所说的接口是指，是指对外部提供对内部操作的的一个通道，可以是接口、类的一些方法或者是一个类
     */
}
