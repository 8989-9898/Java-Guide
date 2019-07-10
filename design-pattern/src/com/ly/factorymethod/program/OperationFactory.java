package com.ly.factorymethod.program;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.program
 * @ClassName: OperationFactory
 * @Author: lin
 * @Description: 定义运算对象生产的接口
 * @Date: 2019-07-08 10:00
 * @Version: 1.0
 */
public interface OperationFactory {

    Operation createOperation();

}
