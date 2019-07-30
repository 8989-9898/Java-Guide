package com.ly.mediator.model;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.model
 * @ClassName: Dept
 * @Author: lin
 * @Description: 部门类
 * @Date: 2019-07-29 16:05
 * @Version: 1.0
 */
public class Dept {

    /**
     * 部门编号
     */
    private String id;
    /**
     * 部门名称
     */
    private String name;

    /**
     * 撤销部门
     * @return
     */
    public boolean deleteDept(){
        DeptUserMediatorImpl mediator = DeptUserMediatorImpl.getInstance();
        /**
         * 通过中介者清除所有与该部门相关连的员工
         */
        mediator.deleteDept(id);
        // 才能正在的清除这个部门
        return true;
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

    public Dept() {
    }

    public Dept(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
