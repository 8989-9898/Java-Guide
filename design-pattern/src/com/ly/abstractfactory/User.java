package com.ly.abstractfactory;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory
 * @ClassName: User
 * @Author: lin
 * @Description: 代表User表
 * @Date: 2019-07-11 10:18
 * @Version: 1.0
 */
public class User {
    private Integer id;
    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
