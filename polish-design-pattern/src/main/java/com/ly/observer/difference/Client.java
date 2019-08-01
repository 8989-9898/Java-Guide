package com.ly.observer.difference;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.difference
 * @ClassName: Client
 * @Author: lin
 * @Description: 区别对待的观察者模式
 * @Date: 2019-08-01 10:47
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
// 创建某类型的报纸
        WaterQuality quality = new WaterQuality();
        // 创建订阅者
        Watcher watcher1 = new Watcher("监测人员");
        Watcher watcher2 = new Watcher("预警人员");
        Watcher watcher3 = new Watcher("监测部门领导");
        // 报纸添加订阅者
        quality.attach(watcher1);
        quality.attach(watcher2);
        quality.attach(watcher3);
        // 更新报纸
        quality.setPolluteLevel(1);
    }
}
