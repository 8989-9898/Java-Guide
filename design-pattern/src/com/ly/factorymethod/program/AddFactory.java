package com.ly.factorymethod.program;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.program
 * @ClassName: AddFactory
 * @Author: lin
 * @Description: 加法生产工程
 * @Date: 2019-07-08 10:05
 * @Version: 1.0
 */
public class AddFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
