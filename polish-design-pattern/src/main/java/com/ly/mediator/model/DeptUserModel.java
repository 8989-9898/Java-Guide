package com.ly.mediator.model;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.model
 * @ClassName: DeptUserModel
 * @Author: lin
 * @Description: 部门和员工关系类
 * @Date: 2019-07-29 17:10
 * @Version: 1.0
 */
public class DeptUserModel {

    /**
     * 用于关联部门和员工的关系键
     */
    private String deptUserId;

    /**
     * 部门编号
     */
    private String deptId;
    /**
     * 员工编号
     */
    private String userId;

    public DeptUserModel() {
    }

    public DeptUserModel(String deptUserId, String deptId, String userId) {
        this.deptUserId = deptUserId;
        this.deptId = deptId;
        this.userId = userId;
    }

    public String getDeptUserId() {
        return deptUserId;
    }

    public void setDeptUserId(String deptUserId) {
        this.deptUserId = deptUserId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
