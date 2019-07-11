package com.ly.observer.three;

import java.util.Date;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.three
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-11 10:01
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        StockObservers observers = new StockObservers("张三", boss);
        NBAObservers observers1 = new NBAObservers("李四", boss);
        boss.addListener(observers,"closeStockMarker",new Date());
        boss.addListener(observers1,"closeNBADirerectSeeding",new Date());
        boss.setState("猫捉老鼠开始");
        boss.nofityX();
    }
}
