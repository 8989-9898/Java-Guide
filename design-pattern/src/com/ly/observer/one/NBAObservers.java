package com.ly.observer.one;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.one
 * @ClassName: NBAObservers
 * @Author: lin
 * @Description: 观看NBA直播的类
 * @Date: 2019-07-10 14:49
 * @Version: 1.0
 */
public class NBAObservers extends Observers {

    public NBAObservers(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getState() +"  "+name +" 关闭NBA直播，继续工作。");
    }
}
