package com.ly.factorymethod.program;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.program
 * @ClassName: MultiplyFactory
 * @Author: lin
 * @Description: 乘法工厂
 * @Date: 2019-07-08 10:44
 * @Version: 1.0
 */
public class MultiplyFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new OperationMultiply();
    }
}
