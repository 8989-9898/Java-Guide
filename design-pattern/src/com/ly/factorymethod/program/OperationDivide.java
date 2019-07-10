package com.ly.factorymethod.program;



/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.program
 * @ClassName: OperationDivide
 * @Author: lin
 * @Description: 计算的除法类
 * @Date: 2019-07-05 10:25
 * @Version: 1.0
 */
public class OperationDivide extends Operation {

    @Override
    double result() {
        if (getNumberB()==0){
            throw new ArithmeticException("除数不能为零");
        }
        return getNumberA()/getNumberB();
    }
}
