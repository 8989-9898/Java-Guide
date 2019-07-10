package com.ly.simplefactory.program;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.program
 * @ClassName: OperationFactory
 * @Author: lin
 * @Description: 计算的简单工厂类
 * @Date: 2019-07-05 10:26
 * @Version: 1.0
 */
public class OperationFactory {

    public static Operation newInstance(String operate) {
        if (operate == null || operate.isEmpty()) {
            throw new NullPointerException("操作不能为空！");
        }
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSubtract();
                break;
            case "*":
                operation = new OperationMultiply();
                break;
            case "/":
                operation = new OperationDivide();
                break;
            default:
                throw new IllegalArgumentException("无效的操作符");
        }
        return operation;
    }
}
