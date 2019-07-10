package com.ly.factorymethod.program;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.program
 * @ClassName: SubtractFactory
 * @Author: lin
 * @Description: 减法工厂
 * @Date: 2019-07-08 10:43
 * @Version: 1.0
 */
public class SubtractFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new OperationSubtract();
    }
}
