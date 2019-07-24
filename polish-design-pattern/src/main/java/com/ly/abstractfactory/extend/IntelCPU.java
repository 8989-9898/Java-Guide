package com.ly.abstractfactory.extend;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.simple
 * @ClassName: IntelCPU
 * @Author: lin
 * @Description: Intel CPU的实现
 * @Date: 2019-07-24 8:44
 * @Version: 1.0
 */
public class IntelCPU implements CPUApi {

    /**
     * CPU 的针脚数
     */
    private int pins;

    public IntelCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel 的CPU，针脚数是："+pins);
    }
}
