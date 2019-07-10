package com.ly.proxy;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.proxy
 * @ClassName: Pursuit
 * @Author: lin
 * @Description: 追求者类
 * @Date: 2019-07-08 9:44
 * @Version: 1.0
 */
public class Pursuit implements GiveGift {

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    private SchoolGirl mm;

    @Override
    public void GiveDolls() {
        System.out.println("给" + mm.getName() + "送洋娃娃");
    }

    @Override
    public void GiveFlowers() {
        System.out.println("给" + mm.getName() + "送鲜花");
    }

    @Override
    public void GiveChocolate() {
        System.out.println("给" + mm.getName() + "送巧克力");
    }
}
