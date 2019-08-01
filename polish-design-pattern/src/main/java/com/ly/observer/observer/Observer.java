package com.ly.observer.observer;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer
 * @ClassName: Observer
 * @Author: lin
 * @Description: 定义观察者接口
 * @Date: 2019-08-01 9:16
 * @Version: 1.0
 */
public interface Observer {

    /**
     * 观察者更新的方法
     * @param subject 用于获取目标对象的属性，拉方式
     */
    public void update(Subject subject);

}
