package com.ly.composite.company;

import com.ly.facade.two.SubSystemFour;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.composite.company
 * @ClassName: HRDepartment
 * @Author: lin
 * @Description: 公司的人力资源部
 * @Date: 2019-07-12 16:19
 * @Version: 1.0
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {}

    @Override
    public void remove(Company company) { }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name+"员工招聘培训管理");
    }
}
