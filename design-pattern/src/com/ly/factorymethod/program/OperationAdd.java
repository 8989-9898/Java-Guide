package com.ly.factorymethod.program;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.program
 * @ClassName: OperationAdd
 * @Author: lin
 * @Description: 计算的加法类
 * @Date: 2019-07-05 10:21
 * @Version: 1.0
 */
public class OperationAdd extends Operation {

    @Override
    double result() {
        return getNumberA()+getNumberB();
    }
}
