package com.ly.mediator.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.pattern
 * @ClassName: SoundCard
 * @Author: lin
 * @Description: 声卡类，一个同事类
 * @Date: 2019-07-29 15:34
 * @Version: 1.0
 */
public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }


    /**
     * 按照声频数据输出声音
     * @param data
     */
    public void soundData(String data){
        System.out.println("正在输出的音频是："+data);
    }
}
