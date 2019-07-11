package com.ly.abstractfactory.reflect;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.simplefactory
 * @ClassName: DataSource
 * @Author: lin
 * @Description: 使用反射代替简单工厂
 * @Date: 2019-07-11 13:07
 * @Version: 1.0
 */
public class DataSource {
    /**
     * 要使用的数据库名称,该值可以写在 xml配置文件中，通过读取配置文件来修改数据源。
     * MySql  Oracle
     */
    private static String db = "MySql";

    public static IUser createUser() {
        String source="com.ly.abstractfactory.reflect."+db+"User";
        IUser iUser = null;
        try {
            iUser = (IUser) Class.forName(source).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return iUser;
    }

    public static IDepartment createDepartment() {
        String source="com.ly.abstractfactory.reflect."+db+"Department";
        IDepartment iDepartment=null;
        try {
            iDepartment =(IDepartment) Class.forName(source).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return iDepartment;
    }
}
