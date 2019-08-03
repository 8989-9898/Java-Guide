package com.ly.command.degeneration;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.degeneration
 * @ClassName: PrintServer
 * @Author: lin
 * @Description: ${DESCRIPTION}
 * @Date: 2019/8/3 17:41
 * @Version: 1.0
 */
public class PrintServer implements Command {

    /**
     * 要输出的内容
     */
    private String string = "";

    public PrintServer(String string) {
        this.string = string;
    }

    @Override
    public void execute() {
        System.out.println("要打印的内容："+string);
    }
}
