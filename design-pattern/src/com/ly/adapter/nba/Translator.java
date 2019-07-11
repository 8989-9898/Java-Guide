package com.ly.adapter.nba;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.adapter.nba
 * @ClassName: Translator
 * @Author: lin
 * @Description: 外籍中锋的翻译，相当于适配器
 * @Date: 2019-07-11 16:20
 * @Version: 1.0
 */
public class Translator extends Player {
    private ForeignCentre foreignCentre = new ForeignCentre();

    public Translator(String name) {
        super(name);
        foreignCentre.setName(name);
    }

    @Override
    public void attack() {
        foreignCentre.jingong();
    }

    @Override
    public void defense() {
        foreignCentre.fangshou();
    }

}
