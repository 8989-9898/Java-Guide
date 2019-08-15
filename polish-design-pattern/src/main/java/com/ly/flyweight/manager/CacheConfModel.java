package com.ly.flyweight.manager;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.manager
 * @ClassName: CacheConfModel
 * @Author: lin
 * @Description: ${DESCRIPTION}
 * @Date: 2019/8/10 21:13
 * @Version: 1.0
 */
public class CacheConfModel {
    /**
     * 缓存开始计时的时间
     */
    private long beginTime;
    /**
     * 缓存存储的时间，就是不被使用的时间长度
     */
    private double durableTime;

    /**
     * 缓存对象需要被永久存储，就是永远不从缓存中删除
     */
    private boolean forever;

    public CacheConfModel(long beginTime, double durableTime, boolean forever) {
        this.beginTime = beginTime;
        this.durableTime = durableTime;
        this.forever = forever;
    }

    public CacheConfModel() {
    }

    public long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }

    public double getDurableTime() {
        return durableTime;
    }

    public void setDurableTime(double durableTime) {
        this.durableTime = durableTime;
    }

    public boolean isForever() {
        return forever;
    }

    public void setForever(boolean forever) {
        this.forever = forever;
    }
}
