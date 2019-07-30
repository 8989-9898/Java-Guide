package com.ly.proxy.no_pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.proxy.no_pattern
 * @ClassName: DeptModel
 * @Author: lin
 * @Description: 部门信息类
 * @Date: 2019/7/30 21:19
 * @Version: 1.0
 */
public class DeptModel {

    private String deptId;
    private String name;

    @Override
    public String toString() {
        return "DeptModel{" +
                "deptId='" + deptId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeptModel() {

    }

    public DeptModel(String deptId, String name) {
        this.deptId = deptId;
        this.name = name;
    }
}
