package com.ly.adapter.nba;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.adapter.nba
 * @ClassName: Guards
 * @Author: lin
 * @Description: 后卫
 * @Date: 2019-07-11 16:13
 * @Version: 1.0
 */
public class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Guards："+name+" attack");
    }

    @Override
    public void defense() {
        System.out.println("Guards："+name+" defense ");
    }
}
