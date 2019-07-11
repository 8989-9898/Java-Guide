package com.ly.abstractfactory.abstractfactory;

import com.ly.abstractfactory.User;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.simplefactory
 * @ClassName: MySqlUser
 * @Author: lin
 * @Description: 使用mysql数据库的表
 * @Date: 2019-07-11 10:21
 * @Version: 1.0
 */
public class MySqlUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("使用MySql数据库添加一个条用户信息" + user);
    }

    @Override
    public User getUser() {
        return new User(4, "使用MySql数据库获取的用户信息");
    }
}
