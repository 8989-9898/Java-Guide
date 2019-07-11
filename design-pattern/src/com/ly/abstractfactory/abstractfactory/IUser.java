package com.ly.abstractfactory.abstractfactory;

import com.ly.abstractfactory.User;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.simplefactory
 * @ClassName: IUser
 * @Author: lin
 * @Description: 访问User表的接口
 * @Date: 2019-07-11 10:16
 * @Version: 1.0
 */
public interface IUser {
    void insert(User user);
    User getUser();
}
