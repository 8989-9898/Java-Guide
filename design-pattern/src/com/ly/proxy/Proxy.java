package com.ly.proxy;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.proxy
 * @ClassName: Proxy
 * @Author: lin
 * @Description: 送礼物的代理类，在该类中调用具体要送礼物的类的方法，隐藏送礼物的类
 * @Date: 2019-07-08 9:46
 * @Version: 1.0
 */
public class Proxy implements GiveGift {

    private GiveGift proxy;

    public Proxy(SchoolGirl girl) {
        this.proxy = new Pursuit(girl);
    }

    @Override
    public void GiveDolls() {
        proxy.GiveDolls();
    }

    @Override
    public void GiveFlowers() {
        proxy.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {
        proxy.GiveChocolate();
    }
}
