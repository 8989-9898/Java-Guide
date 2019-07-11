package com.ly.adapter.nba;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.adapter.nba
 * @ClassName: Forwards
 * @Author: lin
 * @Description: 前锋
 * @Date: 2019-07-11 16:10
 * @Version: 1.0
 */
public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Forwards："+name+" attack");
    }

    @Override
    public void defense() {
        System.out.println("Forwards："+name+" defense");
    }
}
