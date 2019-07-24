package com.ly.abstractfactory.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.pattern
 * @ClassName: Schema1
 * @Author: lin
 * @Description: 定义装机方案一：Intel的CPU ＋ 技嘉的主板
 * @Date: 2019-07-24 10:04
 * @Version: 1.0
 */
public class Schema1 implements AbstractFactory {
    @Override
    public CPUApi createCPU() {
        return new IntelCPU(1159);
    }

    @Override
    public MainBoardApi createMainBoard() {
        return new GAMainBoard(1159);
    }
}
