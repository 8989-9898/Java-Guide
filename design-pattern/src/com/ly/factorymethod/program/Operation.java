package com.ly.factorymethod.program;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.program
 * @ClassName: Operation
 * @Author: lin
 * @Description: 定义运算抽象类
 * @Date: 2019-07-08 9:58
 * @Version: 1.0
 */
public abstract class Operation {
    protected double numberA;

    protected double numberB;

    abstract double result();

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
