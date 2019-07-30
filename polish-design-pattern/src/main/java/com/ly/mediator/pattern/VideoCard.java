package com.ly.mediator.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.pattern
 * @ClassName: VideoCard
 * @Author: lin
 * @Description: 显卡类，一个同事类
 * @Date: 2019-07-29 15:32
 * @Version: 1.0
 */
public class VideoCard extends Colleague {
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 播放视频
     * @param data
     */
    public void showData(String data){
        System.out.println("正在播放的视频是："+data);
    }
}
