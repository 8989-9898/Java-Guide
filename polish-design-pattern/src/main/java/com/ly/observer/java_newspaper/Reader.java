package com.ly.observer.java_newspaper;

import java.util.Observable;
import java.util.Observer;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.newspaper
 * @ClassName: Reader
 * @Author: lin
 * @Description: 报纸的订阅者，就是观察者对象
 * @Date: 2019-08-01 9:51
 * @Version: 1.0
 */
public class Reader implements Observer {

    /**
     * 订阅者的姓名
     */
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(Observable o, Object content) {
        // java 的观察者模式默认实现了 推模式和拉模式,在使用推模式的时候必须使用带参的通知方法，而使用拉模式的时候有参无参都可以。

        // 采用推的方式获取报纸内容
        System.out.println("采用推模式："+name+"获取到报纸正在阅读它，内容是==="+content);
        // 采用拉的方式获取报纸内容
        System.out.println("采用拉模式："+name+"获取到报纸正在阅读它，内容是==="+((NewsPaper)o).getContent());
    }
}
