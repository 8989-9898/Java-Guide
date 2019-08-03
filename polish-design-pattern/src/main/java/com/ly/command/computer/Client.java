package com.ly.command.computer;

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
        Command command = new OpanCommand(mboard);
        // 为机箱的按钮设置相应的开机命令
        Box box = new Box();
        box.setCommand(command);
        // 按下开机按钮，相当于执行开机命令
        box.opanCommand();
    }

}
