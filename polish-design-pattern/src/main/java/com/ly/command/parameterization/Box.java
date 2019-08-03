package com.ly.command.parameterization;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.computer
 * @ClassName: Box
 * @Author: lin
 * @Description: 机箱对象，拥有开机按钮
 * @Date: 2019/8/3 9:47
 * @Version: 1.0
 */
public class Box {

    /**
     * 持有开机命令对象接口
     */
    private Command command;

    /**
     * 设置开机命令对象
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 开机方法，接收并相应用户请求，相当于按下开机按钮触发的方法
     */
    public void opanCommand(){
        // 执行开机的命令
        command.execute();
    }


    /**
     * 持有重启的命令
     */
    private Command resetCommand;

    public void setResetCommand(Command resetCommand) {
        this.resetCommand = resetCommand;
    }

    public void resetComputer(){
        // 执行重启命令
        resetCommand.execute();
    }
}
