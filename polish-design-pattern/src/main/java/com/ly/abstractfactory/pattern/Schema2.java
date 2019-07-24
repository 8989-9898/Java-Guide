package com.ly.abstractfactory.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.pattern
 * @ClassName: Schema1
 * @Author: lin
 * @Description: 定义装机方案二：AMD的CPU ＋ 微星的主板
 * @Date: 2019-07-24 10:04
 * @Version: 1.0
 */
public class Schema2 implements AbstractFactory {
    @Override
    public CPUApi createCPU() {
        return new AMDCPU(988);
    }

    @Override
    public MainBoardApi createMainBoard() {
        return new MSIMainBoard(988);
    }
}
