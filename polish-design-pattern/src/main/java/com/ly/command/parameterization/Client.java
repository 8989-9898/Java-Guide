package com.ly.command.parameterization;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.computer
 * @ClassName: Client
 * @Author: lin
 * @Description: 调用和组合开机方法，在实际中具体的命令组装应该已经组装好，只需要调用据行了
 * @Date: 2019/8/3 9:51
 * @Version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 把命令对象和正在的实现组装起来
         */
        MainBoardApi board = new GigaMainBoard();
        // 切换主板的实现就相当于换了块主板
        MainBoardApi mboard = new MSIMainBoard();
        Command openCommand = new OpanCommand(mboard);
        Command resetCommand = new ResetCommand(mboard);
        // 为机箱的按钮设置相应的命令,正常组装时
        Box box = new Box();
        box.setCommand(openCommand);
        box.setResetCommand(resetCommand);
        // 按下开机按钮，相当于执行开机命令
        System.out.println("正常的配置情况下");
        System.out.println("开机命令>>>>>>>>");
        box.opanCommand();
        System.out.println("重启命令>>>>>>>>");
        box.resetComputer();

        // 错误配置下，应为是参数化配置不会发生错误
        // 开机按钮变为重启功能，重启按钮变为开机功能
        box.setCommand(resetCommand);
        box.setResetCommand(openCommand);
        // 按下开机按钮，相当于执行开机命令
        System.out.println("错误的配置情况下");
        System.out.println("开机命令>>>>>>>>");
        box.opanCommand();
        System.out.println("重启命令>>>>>>>>");
        box.resetComputer();


    }

}
