package com.ly.mediator.mediator;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator
 * @ClassName: Mediator
 * @Author: lin
 * @Description: 中介者接口
 * @Date: 2019-07-29 14:44
 * @Version: 1.0
 */
public interface Mediator {

    /**
     * 中介者的中介方法
     * @param colleague
     */
    void change(Colleague colleague,String message);
}
