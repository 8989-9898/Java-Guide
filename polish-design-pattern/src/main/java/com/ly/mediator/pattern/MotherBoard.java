package com.ly.mediator.pattern;

import com.ly.builder.pattern.Director;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.pattern
 * @ClassName: MotherBoard
 * @Author: lin
 * @Description: 主板类，一个中介者的具体实现类
 * @Date: 2019-07-29 15:36
 * @Version: 1.0
 */
public class MotherBoard implements Mediator {

    /**
     * 需要知道的交互同事对象，光驱
     */
    private CDDriver cdDriver;
    /**
     * 需要知道的交互同事对象，CPU
     */
    private CPU cpu;
    /**
     * 需要知道的交互同事对象，视频
     */
    private VideoCard videoCard;

    /**
     * 需要知道的交互同事对象，音频
     */
    private SoundCard soundCard;

    @Override
    public void changed(Colleague colleague) {
        if (cdDriver == colleague) {
            // 表示开始光驱读取数据
            openCDDriverReadData((CDDriver) colleague);
        } else if (cpu == colleague) {
            // 表示CPU解析完成数据
            this.openCPU((CPU) colleague);
        }
    }

    /**
     * cpu解析完成的播放
     * @param cpu
     */
    private void openCPU(CPU cpu) {
        // 先获取cpu解析的数据
        String soundData = cpu.getSoundData();
        String videoData = cpu.getVideoData();
        // 开始播放
        this.videoCard.showData(videoData);
        this.soundCard.soundData(soundData);
    }

    /**
     * 光驱开始读取数据，同时在读取结束时通知cpu进行解析
     * @param driver
     */
    private void openCDDriverReadData(CDDriver driver) {
        // 获取光驱读取的数据
        String data = driver.getData();
        // cpu 开始解析数据
        this.cpu.executeData(data);
    }

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }
}
