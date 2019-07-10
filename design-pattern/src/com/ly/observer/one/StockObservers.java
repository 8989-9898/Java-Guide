package com.ly.observer.one;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.one
 * @ClassName: StockObservers
 * @Author: lin
 * @Description: 看股票的对象
 * @Date: 2019-07-10 14:46
 * @Version: 1.0
 */
public class StockObservers extends Observers {

    public StockObservers(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getState() +"  "+name +" 关闭股票行情，继续工作。");
    }
}
