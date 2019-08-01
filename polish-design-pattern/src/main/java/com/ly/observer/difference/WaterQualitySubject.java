package com.ly.observer.difference;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.difference
 * @ClassName: WaterQualitySubject
 * @Author: lin
 * @Description:
 * @Date: 2019-08-01 10:58
 * @Version: 1.0
 */
public abstract class WaterQualitySubject {
    protected List<WatcherObserver> watchers = new ArrayList<>();

    public void attach(Watcher watcher){
        watchers.add(watcher);
    }

    public void detach(Watcher watcher){
        watchers.remove(watcher);
    }

    public abstract void notifyObserver();

    /**
     * 水质的污染级别
     * @return
     */
    public abstract int getPolluteLevel();
}
