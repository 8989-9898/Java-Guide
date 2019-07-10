package com.ly.factorymethod.program;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.program
 * @ClassName: DivideFactory
 * @Author: lin
 * @Description: 除法生产工厂
 * @Date: 2019-07-08 10:06
 * @Version: 1.0
 */
public class DivideFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        return new OperationDivide();
    }
}
