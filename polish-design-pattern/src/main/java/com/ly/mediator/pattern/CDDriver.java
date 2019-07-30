package com.ly.mediator.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.pattern
 * @ClassName: CDDriver
 * @Author: lin
 * @Description: 光驱类，一个同事类
 * @Date: 2019-07-29 15:22
 * @Version: 1.0
 */
public class CDDriver extends Colleague {
    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    /**
     * 保存读取的数据
     */
    private String data;

    /**
     * 读取光盘
     */
    public void readCD(){
        // 逗号前是视频显示的数据，逗号后是声音
        data="设计模式，需要深入研究";
        // 通知主板自己发生了改变
        this.getMediator().changed(this);
    }

    /**
     * 获取读取的数据
     * @return
     */
    public String getData() {
        return data;
    }
}
