package com.ly.observer.three;


import java.util.Date;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.one
 * @ClassName: StockObservers
 * @Author: lin
 * @Description: 看股票的观察者类
 * @Date: 2019-07-10 14:46
 * @Version: 1.0
 */
public class StockObservers {
    private Subject subject;
    private String name;

    public StockObservers(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void closeStockMarker(Date date) {
        System.out.println("现在时间是：" + date.getTime());
        System.out.println(subject.getState() + "  " + name + " 关闭股票行情，继续工作。");
    }
}
