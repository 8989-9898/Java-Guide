package com.ly.proxy.pattern;

import java.sql.SQLException;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.proxy.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用代理模式的事例（虚代理）
 * @Date: 2019/7/30 22:15
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserManager manager = new UserManager();
        List<UserModelApi> users = manager.getUserByDeptId("0102");
        System.out.println("不访全部数据时");
        users.forEach((e)->{
            System.out.println("用户编号："+e.getUserId()+",用户姓名："+e.getName());
            System.out.println(e);
        });

        System.out.println("访全部数据时");
        users.forEach((e)->{
            System.out.println("用户编号："+e.getUserId()+",用户姓名："+e.getName()+",用户性别："+e.getSex());
            System.out.println(e);
        });
    }
}
