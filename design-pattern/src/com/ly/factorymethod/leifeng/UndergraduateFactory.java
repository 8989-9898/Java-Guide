package com.ly.factorymethod.leifeng;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.leifeng
 * @ClassName: UndergraduateFactory
 * @Author: lin
 * @Description: 大学生生产工厂
 * @Date: 2019-07-08 11:00
 * @Version: 1.0
 */
public class UndergraduateFactory implements LFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
