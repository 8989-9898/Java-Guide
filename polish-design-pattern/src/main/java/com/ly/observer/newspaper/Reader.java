package com.ly.observer.newspaper;

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
    public void update(Subject subject) {
        // 采用拉的方式获取报纸内容
        System.out.println(name+"获取到报纸正在阅读它，内容是==="+((NewsPaper)subject).getContent());
    }
}
