package com.ly.abstractfactory.dao;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.dao
 * @ClassName: RdbOrderMainImpl
 * @Author: lin
 * @Description: 关系型数据库主订单的实现
 * @Date: 2019-07-24 10:53
 * @Version: 1.0
 */
public class RdbOrderMainImpl implements OrderMainDAO {
    @Override
    public void saveOrderMain() {
        System.out.println("使用关系型数据库保存订单主信息");
    }
}
