package com.ly.simplefactory.program;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.program
 * @ClassName: OperationSubtract
 * @Author: lin
 * @Description: 计算的减法类
 * @Date: 2019-07-05 10:22
 * @Version: 1.0
 */
public class OperationSubtract extends Operation {
    @Override
    public double getResult() {
        return getNumberA()-getNumberB();
    }
}
