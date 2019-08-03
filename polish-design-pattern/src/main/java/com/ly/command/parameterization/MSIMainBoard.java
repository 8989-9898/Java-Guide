package com.ly.command.parameterization;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.computer
 * @ClassName: GigaMainBoard
 * @Author: lin
 * @Description: 微星的主板的开机方法，就是具体的功能执行者
 * @Date: 2019/8/3 9:33
 * @Version: 1.0
 */
public class MSIMainBoard implements MainBoardApi {


    /**
     * 真正的开机实现
     */
    @Override
    public void open() {
        System.out.println("微星的主板正在开机，请稍后...");
        System.out.println("连接电源.....");
        System.out.println("设备检查.....");
        System.out.println("装载系统.....");
        System.out.println("机器正常运转起来.....");
        System.out.println("机器已经正常开启，请操作");
        System.out.println("技嘉的主板正在开机，清稍后");
    }

    @Override
    public void reset() {
        System.out.println("微星的主板正在重启机器，请稍后...");
        System.out.println("机器重启成功，请操作");
    }
}
