package com.ly.mediator.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.pattern
 * @ClassName: Mediator
 * @Author: lin
 * @Description: 电脑组件的中介者
 * @Date: 2019-07-29 15:16
 * @Version: 1.0
 */
public interface Mediator {

    /**
     * 同事对象在自身改变时来通知中介者的方法。
     * 让中介者去负责相应的也其它同事对象的交互
     * @param colleague 同事对象自身，好让中介者对象通过对象实例去获取同事对象的状态
     */
    public void changed(Colleague colleague);

}
