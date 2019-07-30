package com.ly.proxy.no_pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.proxy.no_pattern
 * @ClassName: UserModel
 * @Author: lin
 * @Description: 员工信息类
 * @Date: 2019/7/30 21:16
 * @Version: 1.0
 */

public class UserModel {

    private String userId;
    private String name;
    private String deptId;
    private String sex;

    @Override
    public String toString() {
        return "UserModel{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", deptId='" + deptId + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public UserModel() {
    }

    public UserModel(String userId, String name, String deptId, String sex) {
        this.userId = userId;
        this.name = name;
        this.deptId = deptId;
        this.sex = sex;
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

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
