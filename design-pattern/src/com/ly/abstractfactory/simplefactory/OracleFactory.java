package com.ly.abstractfactory.simplefactory;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.factorymethod
 * @ClassName: OracleFactory
 * @Author: lin
 * @Description: 创建使用Oracle数据库连接的工厂
 * @Date: 2019-07-11 10:39
 * @Version: 1.0
 */
public class OracleFactory implements Factory {
    @Override
    public IUser createUser() {
        return new OracleUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new OracleDepartment();
    }
}
