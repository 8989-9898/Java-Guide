package com.ly.proxy;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.proxy
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-08 9:52
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl();
        girl.setName("校花");
        Proxy proxy = new Proxy(girl);
        proxy.GiveDolls();
        proxy.GiveChocolate();
        proxy.GiveFlowers();
    }
}
