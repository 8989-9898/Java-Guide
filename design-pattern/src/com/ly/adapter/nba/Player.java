package com.ly.adapter.nba;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.adapter.nba
 * @ClassName: Player
 * @Author: lin
 * @Description: 球员类
 * @Date: 2019-07-11 16:08
 * @Version: 1.0
 */
public abstract class Player  {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void defense();
}
