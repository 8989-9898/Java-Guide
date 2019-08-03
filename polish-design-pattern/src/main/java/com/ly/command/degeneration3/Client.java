package com.ly.command.degeneration3;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.degeneration3
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用内部类的方法实现简化的命令
 * @Date: 2019/8/3 17:52
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {

        // 使用内部内准备命令
        Command command = new Command() {
            /**
             * 要输出的内容
             */
            private String string = "";

            public void setString(String string) {
                this.string = string;
            }

            @Override
            public void execute() {
                System.out.println("要打印的内容："+string);
            }

        };

        command.setString("退化的命令模式");
        command.execute();

    }
}
