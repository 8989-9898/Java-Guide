package com.ly.abstractfactory.simplefactory;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.factorymethod
 * @ClassName: MySqlFactory
 * @Author: lin
 * @Description: 创建MySql数据库连接的对象
 * @Date: 2019-07-11 10:38
 * @Version: 1.0
 */
public class MySqlFactory implements Factory {
    @Override
    public IUser createUser() {
        return new MySqlUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MySqlDepartment();
    }
}
