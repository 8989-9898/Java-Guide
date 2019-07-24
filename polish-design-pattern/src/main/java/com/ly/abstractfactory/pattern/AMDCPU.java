package com.ly.abstractfactory.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.simple
 * @ClassName: IntelCPU
 * @Author: lin
 * @Description: AMD CPU的实现
 * @Date: 2019-07-24 8:44
 * @Version: 1.0
 */
public class AMDCPU implements CPUApi {

    /**
     * CPU 的针脚数
     */
    private int pins;

    public AMDCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("AMD 的CPU，针脚数是："+pins);
    }
}
