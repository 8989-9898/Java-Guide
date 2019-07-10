package com.ly.simplefactory.program;

import java.util.Scanner;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.program
 * @ClassName: OperationMain
 * @Author: lin
 * @Description: 计算的操作类
 * @Date: 2019-07-05 10:35
 * @Version: 1.0
 */
public class OperationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数:");
        double numberA = scanner.nextDouble();
        System.out.print("请输入第二个数:");
        double numberB = scanner.nextDouble();
        System.out.print("请输入要进行的操作( +、-、*、/ ):");
        String operate = scanner.next();
        Operation operation = OperationFactory.newInstance(operate);
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        System.out.println("计算的结果是:" + operation.getResult());
    }
}
