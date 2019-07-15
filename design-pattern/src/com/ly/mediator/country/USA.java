package com.ly.mediator.country;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.country
 * @ClassName: USA
 * @Author: lin
 * @Description: 具体的国家 美国
 * @Date: 2019-07-15 13:33
 * @Version: 1.0
 */
public class USA extends Country {
    public USA(UnitedNations nations) {
        super(nations);
    }

    public void declare(String message){
        this.nations.declare(message,this);
    }

    public void show(String message){
        System.out.println("美国接收到的信息："+message);
    }
}
