package com.ly.observer.java_newspaper;


import java.util.Observable;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.newspaper
 * @ClassName: NewsPaper
 * @Author: lin
 * @Description: 具体的目标对象，某一类型的报纸
 * @Date: 2019-08-01 9:47
 * @Version: 1.0
 */
public class NewsPaper extends Observable {
    /**
     * 用来描述报纸内容
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        // 在使用java 的观察者模式的时候需要添加，表示发生改变
        this.setChanged();
        // 内容有更新了，说明出了新的报纸通知订阅者阅读新报纸
        this.notifyObservers(this.content);
        // 采用拉模式的
        // this.notifyObservers();
    }
}
