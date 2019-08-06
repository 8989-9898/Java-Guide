package com.ly.template;

import java.util.*;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.template
 * @ClassName: Sort
 * @Author: lin
 * @Description: 排序
 * @Date: 2019/8/6 21:08
 * @Version: 1.0
 */
public class Sort {
    public static void main(String[] args) {
        List<UserModel> list = Arrays.asList(
                new UserModel("user01", "张三", 30),
                new UserModel("user01", "张三", 20),
                new UserModel("user01", "张三", 15),
                new UserModel("user01", "张三", 50),
                new UserModel("user01", "张三", 24)
        );
        System.out.println("排序前------------------>");
        list.forEach(System.out::println);
        System.out.println("排序后------------------>");
        Collections.sort(list, new Comparator<UserModel>() {
            @Override
            public int compare(UserModel o1, UserModel o2) {
                return o1.getAge()>o2.getAge()?1:o1.getAge()==o2.getAge()?0:-1;
            }
        });
        list.forEach(System.out::println);

    }
}

class UserModel {
    private String userId, name;
    private int age;

    @Override
    public String toString() {
        return "UserModel{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public UserModel(String userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
