package com.ly.adapter.nba;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.adapter.nba
 * @ClassName: ForeignCentre
 * @Author: lin
 * @Description: 外籍中锋，听不懂英语
 * @Date: 2019-07-11 16:17
 * @Version: 1.0
 */
public class ForeignCentre {

    private String name;

    public void jingong(){
        System.out.println("外籍中锋："+name+" 进攻");
    }

    public void fangshou(){
        System.out.println("外籍中锋："+name+" 防守");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
