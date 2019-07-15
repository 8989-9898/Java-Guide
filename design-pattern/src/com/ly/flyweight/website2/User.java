package com.ly.flyweight.website2;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.website2
 * @ClassName: User
 * @Author: lin
 * @Description: 共享的外部状态
 * @Date: 2019/7/15 21:34
 * @Version: 1.0
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
