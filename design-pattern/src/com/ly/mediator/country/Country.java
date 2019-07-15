package com.ly.mediator.country;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.country
 * @ClassName: Country
 * @Author: lin
 * @Description: 抽象国家
 * @Date: 2019-07-15 13:30
 * @Version: 1.0
 */
public abstract class Country {
    protected UnitedNations nations;

    public Country(UnitedNations nations) {
        this.nations = nations;
    }
}
