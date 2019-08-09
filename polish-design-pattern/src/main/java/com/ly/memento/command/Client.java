package com.ly.memento.command;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.revoke
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用命令模式和备忘录模式使用简单的撤销和恢复操作
 * @Date: 2019/8/3 11:44
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 组装命令和接受者
        OperationApi api = new Operation();
        AddCommand add = new AddCommand( 50);
        SubstractCommand substract = new SubstractCommand( 30);
        add.setOperation (api);
        substract.setOperation (api);
        // 将命令设入到计算机中（持有者）
        Calculator calculator = new Calculator();
        calculator.setAddCmd(add);
        calculator.setSubstractCmd(substract);
        // 模拟按下按钮，测试
        calculator.substractPressed();
        System.out.println("一次减法运算的结果是：" + api.getResult());
        calculator.addPressed();
        System.out.println("一次加法运算的结果是：" + api.getResult());
        calculator.undoPressed();
        System.out.println("撤销一次的结果为：" + api.getResult());
        calculator.undoPressed();
        System.out.println("撤销两次的结果为：" + api.getResult());

        calculator.redoPressed();
        System.out.println("恢复一次的节共为："+api.getResult());
        calculator.redoPressed();
        System.out.println("恢复两次的节共为："+api.getResult());



    }
}
