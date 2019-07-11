package com.ly.abstractfactory.reflect;


import com.ly.abstractfactory.User;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.simplefactory
 * @ClassName: Main
 * @Author: lin
 * @Description: 使用简单工厂的方式改进抽象工厂
 * @Date: 2019-07-11 11:23
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        IUser user = DataSource.createUser();
        user.insert(new User(3,"lisi"));
        System.out.println(user.getUser());


    }
}
