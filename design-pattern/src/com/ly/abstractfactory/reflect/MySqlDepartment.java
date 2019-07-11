package com.ly.abstractfactory.reflect;

import com.ly.abstractfactory.Department;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.abstractfactory
 * @ClassName: MySqlDepartment
 * @Author: lin
 * @Description: 使用MySql数据源的部门表
 * @Date: 2019-07-11 10:59
 * @Version: 1.0
 */
public class MySqlDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("使用MySql数据库添加一个条部门信息" + department);
    }


    @Override
    public Department getDepartment() {
        return new Department(9, "使用MySql数据库获取的部门信息");
    }
}
