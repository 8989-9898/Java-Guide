package com.ly.abstractfactory.dao;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.dao
 * @ClassName: RdbDAOFactory
 * @Author: lin
 * @Description: 使用关系型数据库的抽象工厂实现
 * @Date: 2019-07-24 10:58
 * @Version: 1.0
 */
public class RdbDAOFactory implements DAOFactory{

    @Override
    public OrderMainDAO createOrderMainDAO() {
        return new RdbOrderMainImpl();
    }

    @Override
    public OrderDetailDAO createOrderDetailDAO() {
        return new RdbOrderDetailImpl();
    }
}
