package com.ly.abstractfactory.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.pattern
 * @ClassName: AbstractFactory
 * @Author: lin
 * @Description: 定义组装电脑的抽象工厂接口
 * @Date: 2019-07-24 10:02
 * @Version: 1.0
 */
public interface AbstractFactory {

    /**
     * 定义创建 CPU 的方法
     *
     * @return
     */
    public CPUApi createCPU();

    /**
     * 定义创建 主板 的方法
     *
     * @return
     */
    public MainBoardApi createMainBoard();
}
