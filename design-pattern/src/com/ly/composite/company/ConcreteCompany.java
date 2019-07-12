package com.ly.composite.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.composite.company
 * @ClassName: ConcreteCompany
 * @Author: lin
 * @Description: 具体的公司
 * @Date: 2019-07-12 16:16
 * @Version: 1.0
 */
public class ConcreteCompany extends Company {

    private List<Company> companies=new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
companies.add(company);
    }

    @Override
    public void remove(Company company) {
companies.remove(company);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        companies.forEach((e)->e.display(depth+2));
    }

    @Override
    public void lineOfDuty() {
        companies.forEach((e)->e.lineOfDuty());
    }
}
