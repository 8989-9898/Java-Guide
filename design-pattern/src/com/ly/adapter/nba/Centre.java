package com.ly.adapter.nba;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.adapter.nba
 * @ClassName: Centre
 * @Author: lin
 * @Description: 中锋类
 * @Date: 2019-07-11 16:12
 * @Version: 1.0
 */
public class Centre extends Player {
    public Centre(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Centre："+name+" attack");

    }

    @Override
    public void defense() {
        System.out.println("Centre："+name+" defense");

    }
}
