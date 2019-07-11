package com.ly.abstractfactory.simplefactory;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.simplefactory
 * @ClassName: DataSource
 * @Author: lin
 * @Description: 简单工厂，用于区分数据源
 *               解决了在多个客户端使用了抽象工厂创建数据源时，需要修改多处变成了只在该类修改就可以了
 * @Date: 2019-07-11 13:07
 * @Version: 1.0
 */
public class DataSource {
    /**
     * 要使用的数据名称
     */
    private static String db = "MySql";

    public static IUser createUser() {
        IUser iUser = null;
        switch (db) {
            case "MySql":
                iUser = new MySqlUser();
                break;
            case "Oracle":
                iUser = new OracleUser();
                break;
            default:
                iUser = new MySqlUser();
        }
        return iUser;
    }

    public static IDepartment createDepartment() {
        IDepartment iDepartment=null;
        switch (db) {
            case "MySql":
                iDepartment = new MySqlDepartment();
                break;
            case "Oracle":
                iDepartment = new OracleDepartment();
                break;
            default:
                iDepartment = new MySqlDepartment();
        }
        return iDepartment;
    }
}
