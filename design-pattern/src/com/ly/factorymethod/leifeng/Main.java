package com.ly.factorymethod.leifeng;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.leifeng
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-08 11:01
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        // 如果需要修改为自愿者只需要修改 UndergraduateFactory 为 VolunteerFactory 即可
        LFactory factory = new UndergraduateFactory();
        LeiFeng leiFeng = factory.createLeiFeng();
        leiFeng.buyRice();
        leiFeng.sweep();
        leiFeng.wash();
    }
}
