package com.ly.simplefactory.program;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.program
 * @ClassName: Operation
 * @Author: lin
 * @Description: 计算的父类
 * @Date: 2019-07-05 10:17
 * @Version: 1.0
 */
public abstract class Operation {
    private double numberA;
    private double numberB;

    /**
     * 用于计算的方法
     */
    public abstract double getResult();


    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
