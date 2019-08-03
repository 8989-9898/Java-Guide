package com.ly.command.parameterization;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.computer
 * @ClassName: MainBoardApi
 * @Author: lin
 * @Description: 定义主板接口，具有开机功能的接收者，拥有真正的功能实现
 * @Date: 2019/8/3 9:31
 * @Version: 1.0
 */
public interface MainBoardApi {

    /**
     * 开机方法
     */
    public void open();

    /**
     * 主板具有重启的功能
     */
    public void reset();
}
