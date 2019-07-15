package com.ly.mediator.country;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.country
 * @ClassName: Iraq
 * @Author: lin
 * @Description: 具体的国家 伊拉克
 * @Date: 2019-07-15 13:34
 * @Version: 1.0
 */
public class Iraq extends Country {
    public Iraq(UnitedNations nations) {
        super(nations);
    }
    public void declare(String message){
        this.nations.declare(message,this);
    }

    public void show(String message){
        System.out.println("伊拉克接收到的信息："+message);
    }
}
