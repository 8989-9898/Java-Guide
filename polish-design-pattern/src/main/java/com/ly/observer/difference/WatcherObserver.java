package com.ly.observer.difference;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.difference
 * @ClassName: WatcherObserver
 * @Author: lin
 * @Description:
 * @Date: 2019-08-01 10:48
 * @Version: 1.0
 */
public interface WatcherObserver {
    /**
     * 被通知的方法
     * @param subject
     */
    public void update(WaterQualitySubject subject);

    /**
     * 设置观察人员的职务
     * @param job
     */
    public void setJob(String job);

    /**
     * 获取观察人员的职务
     * @return
     */
    public String getJob();
}
