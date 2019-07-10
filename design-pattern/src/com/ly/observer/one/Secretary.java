package com.ly.observer.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.one
 * @ClassName: Secretary
 * @Author: lin
 * @Description: 前台通知类
 * @Date: 2019-07-10 14:51
 * @Version: 1.0
 */
public class Secretary extends Subject {

    private List<Observers> observers = new ArrayList<>();

    @Override
    public void attach(Observers observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observers observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有需要要通在的类
     */
    @Override
    public void notifys() {
        observers.forEach((e) -> e.update());
    }
}
