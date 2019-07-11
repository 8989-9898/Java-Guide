package com.ly.abstractfactory.simplefactory;

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
        /**
         * 而简单工厂只需要知道工厂在哪，调用指定的方法就行了，至于创建的是哪个数据源，就由简单工厂内部实现
         */
        IUser user = DataSource.createUser();
        user.insert(new User(3,"lisi"));
        System.out.println(user.getUser());

        /**
         * 使用抽象工厂，需要知道抽象工厂是谁和具体的创建工厂是谁
         */
        Factory factory=new OracleFactory();
        IUser user1 = factory.createUser();
        System.out.println(user1.getUser());

    }
}
