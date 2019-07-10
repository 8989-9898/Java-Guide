package com.ly.observer.one;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.one
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-10 14:56
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        StockObservers stockObservers = new StockObservers("张三", boss);
        NBAObservers nbaObservers = new NBAObservers("王五", boss);
        StockObservers stockObservers1 = new StockObservers("李四", boss);
        boss.attach(stockObservers);
        boss.attach(stockObservers1);
        boss.attach(nbaObservers);

        boss.detach(stockObservers1);

        boss.setState("老板偷偷的回来抓偷懒的人了");
        boss.notifys();// 通知
    }
}
