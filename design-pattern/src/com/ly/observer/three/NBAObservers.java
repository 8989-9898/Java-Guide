package com.ly.observer.three;


import java.util.Date;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.one
 * @ClassName: NBAObservers
 * @Author: lin
 * @Description: 观看NBA直播的观察者类
 * @Date: 2019-07-10 14:49
 * @Version: 1.0
 */
public class NBAObservers {
    private Subject subject;
    private String name;

    public NBAObservers(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void closeNBADirerectSeeding(Date date) {
        System.out.println("现在时间是：" + date);
        System.out.println(subject.getState() + "  " + name + " 关闭NBA直播，继续工作。");
    }
}
