package com.ly.mediator.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用中介者模式来，完成电脑看电影的过程
 * @Date: 2019-07-29 15:08
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 声明主板对象
        MotherBoard board = new MotherBoard();
        // 声明同时对象，同时设置统一的中介者
        CDDriver cdDriver = new CDDriver(board);
        CPU cpu = new CPU(board);
        VideoCard videoCard = new VideoCard(board);
        SoundCard soundCard = new SoundCard(board);
        // 中介者获取所有同事的对象，用于交互
        board.setCdDriver(cdDriver);
        board.setCpu(cpu);
        board.setVideoCard(videoCard);
        board.setSoundCard(soundCard);

        // 开始看电影，将光盘放入光驱中，光驱开始读取数据
        cdDriver.readCD();

    }
}
