package com.ly.abstractfactory.simplefactory;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.simplefactory
 * @ClassName: Factory
 * @Author: lin
 * @Description: 用于切换数据库的接口
 * @Date: 2019-07-11 10:25
 * @Version: 1.0
 */
public interface Factory {
    IUser createUser();
    IDepartment createDepartment();
}
