package com.ly.abstractfactory.factorymethod;

import com.ly.abstractfactory.User;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.factorymethod
 * @ClassName: Main
 * @Author: lin
 * @Description: 使用工厂方法模式虽然可以用于使用不同的数据源，但是扩展起来很麻烦，需要添加许多的类来进行扩展
 * @Date: 2019-07-11 10:41
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Factory factory=new MySqlFactory();
        IUser user = factory.createUser();
        System.out.println(user.getUser());
        user.insert(new User(1,"李四"));
        factory=new OracleFactory();
        IUser user1 = factory.createUser();
        System.out.println(user1.getUser());
        user1.insert(new User(4,"王五"));
    }
}
