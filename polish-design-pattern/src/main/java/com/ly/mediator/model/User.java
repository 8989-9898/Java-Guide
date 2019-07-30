package com.ly.mediator.model;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.model
 * @ClassName: User
 * @Author: lin
 * @Description: 员工类
 * @Date: 2019-07-29 16:10
 * @Version: 1.0
 */
public class User {
    /**
     * 员工编号
     */
    private String id;
    /**
     * 员工姓名
     */
    private String name;

    /**
     * 人员离职
     * @return
     */
    public boolean deleteUser(){
        DeptUserMediatorImpl mediator = DeptUserMediatorImpl.getInstance();
        // 清除该员工与所有部门的关联
        mediator.deleteUser(id);
        return true;
    }

    public User() {
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
