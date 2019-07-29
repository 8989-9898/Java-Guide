package com.ly.mediator.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.pattern
 * @ClassName: CPU
 * @Author: lin
 * @Description: CPU类，一个同事类
 * @Date: 2019-07-29 15:26
 * @Version: 1.0
 */
public class CPU extends Colleague {
    public CPU(Mediator mediator) {
        super(mediator);
    }

    /**
     * 解析出来的视频数据
     */
    private String videoData;

    /**
     * 解析出来的音频数据
     */
    private String soundData;

    /**
     * 解析数据，将数据解析为视频和音频数据
     * @param data 被处理的数据
     */
    public void executeData(String data){
        // 逗号前是视频，逗号后是音频
        String[] split = data.split("，|,");
        this.videoData=split[0];
        this.soundData=split[1];
        // 通知主板 CPU 的工作已经完成
        this.getMediator().changed(this);
    }

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }
}
