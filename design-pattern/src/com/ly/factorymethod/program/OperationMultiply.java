package com.ly.factorymethod.program;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.program
 * @ClassName: OperationMultiply
 * @Author: lin
 * @Description: 计算的乘法类
 * @Date: 2019-07-05 10:24
 * @Version: 1.0
 */
public class OperationMultiply extends Operation {

    @Override
    double result() {
        return getNumberA() * getNumberB();
    }
}
