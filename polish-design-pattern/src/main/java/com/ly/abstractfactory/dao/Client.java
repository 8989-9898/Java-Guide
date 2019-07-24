package com.ly.abstractfactory.dao;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.dao
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用抽象工厂的数据访问层
 * @Date: 2019-07-24 10:38
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建 dao 的抽象工厂
        DAOFactory factory = new RdbDAOFactory();
        // 使用工厂创建所需的 dao 接口
        OrderDetailDAO detailDAO = factory.createOrderDetailDAO();
        OrderMainDAO mainDAO = factory.createOrderMainDAO();
        // 执行数据保存操作
        mainDAO.saveOrderMain();
        detailDAO.saveOrderDetail();
    }
}
