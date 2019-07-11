package com.ly.abstractfactory.abstractfactory;

import com.ly.abstractfactory.Department;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.abstractfactory
 * @ClassName: OracleDepartment
 * @Author: lin
 * @Description: 使用Oracle数据源的部门表
 * @Date: 2019-07-11 11:01
 * @Version: 1.0
 */
public class OracleDepartment implements IDepartment{

    @Override
    public void insert(Department department) {
        System.out.println("使用Oracle数据库添加一个条部门信息" + department);
    }

    @Override
    public Department getDepartment() {
        return new Department(9, "使用Oracle数据库获取的部门信息");
    }
}
