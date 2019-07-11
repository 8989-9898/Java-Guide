package com.ly.abstractfactory.reflect;

import com.ly.abstractfactory.Department;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.abstractfactory
 * @ClassName: IDepartment
 * @Author: lin
 * @Description: 用于操作部门表的接口
 * @Date: 2019-07-11 10:57
 * @Version: 1.0
 */
public interface IDepartment {
    void insert(Department department);
    Department getDepartment();
}
