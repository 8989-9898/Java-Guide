package com.ly.observer.push_newspaper;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.newspaper
 * @ClassName: Observer
 * @Author: lin
 * @Description: 观察者接口，读报纸
 * @Date: 2019-08-01 9:43
 * @Version: 1.0
 */
public interface Observer {

    /**
     * 被通知的方法
     * @param content 使用推模式，直接推送报纸内容
     */
    public void update(String content);
}
