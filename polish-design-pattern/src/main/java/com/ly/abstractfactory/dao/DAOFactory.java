package com.ly.abstractfactory.dao;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.dao
 * @ClassName: DAOFactory
 * @Author: lin
 * @Description: 抽象工厂，创建订单的主、子记录
 * @Date: 2019-07-24 10:47
 * @Version: 1.0
 */
public interface DAOFactory {

    /**
     * 创建订单主记录的 dao 对象
     * @return 具体的某种实现方式的对象
     */
    public OrderMainDAO createOrderMainDAO();

    /**
     * 创建订单子记录的 dao 对象
     * @return 具体的某种实现方式的对象
     */
    public OrderDetailDAO createOrderDetailDAO();


}
