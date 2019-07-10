package com.ly.factorymethod.leifeng;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.leifeng
 * @ClassName: VolunteerFactory
 * @Author: lin
 * @Description: 自愿者生产工厂
 * @Date: 2019-07-08 11:01
 * @Version: 1.0
 */
public class VolunteerFactory implements LFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
