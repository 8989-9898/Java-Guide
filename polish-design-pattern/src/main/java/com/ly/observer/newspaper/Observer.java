package com.ly.observer.newspaper;

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
     * @param subject 具体的目标对象，可以用来获取报纸内容
     */
    public void update(Subject subject);
}
