package com.ly.abstractfactory.dao;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.dao
 * @ClassName: RdbOrderDetailImpl
 * @Author: lin
 * @Description: 关系型数据库子订单的实现
 * @Date: 2019-07-24 10:55
 * @Version: 1.0
 */
public class RdbOrderDetailImpl implements OrderDetailDAO {
    @Override
    public void saveOrderDetail() {
        System.out.println("使用关系型数据库保存的订单子记录的操作");
    }
}
