package com.ly.observer.difference;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.difference
 * @ClassName: Watcher
 * @Author: lin
 * @Description: 具体的观察者
 * @Date: 2019-08-01 11:00
 * @Version: 1.0
 */
public class Watcher implements WatcherObserver {
    /**
     * 职位
     */
    private String job;

    public Watcher(String job) {
        this.job = job;
    }

    @Override
    public void update(WaterQualitySubject subject) {
        // 采用拉的方式获取数据
        System.out.println(job+":>获取到通知，当前的污染级别是：" + subject.getPolluteLevel());
    }

    @Override
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String getJob() {
        return this.job;
    }
}
