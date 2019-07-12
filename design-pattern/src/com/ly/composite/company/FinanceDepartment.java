package com.ly.composite.company;

import com.ly.facade.two.SubSystemFour;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.composite.company
 * @ClassName: FinanceDepartment
 * @Author: lin
 * @Description: 公司财务部
 * @Date: 2019-07-12 16:25
 * @Version: 1.0
 */
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
System.out.println(name+" 公司财务部发钱了，快来啊");
    }
}
