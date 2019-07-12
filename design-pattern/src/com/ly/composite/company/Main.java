package com.ly.composite.company;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.composite.company
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-12 16:27
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        ConcreteCompany company = new ConcreteCompany("北京总公司");
        company.add(new HRDepartment("总公司人力资源部"));
        company.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany company1 = new ConcreteCompany("杭州分公司");
        company1.add(new HRDepartment("杭州分公司人力资源部"));
        company1.add(new FinanceDepartment("杭州分公司财务部"));

        ConcreteCompany company2 = new ConcreteCompany("深圳分公司");
        company2.add(new HRDepartment("深圳分公司人力资源部"));
        company2.add(new FinanceDepartment("深圳分公司财务部"));

        company.add(company1);
        company.add(company2);

        company.display(2);
        company.lineOfDuty();
    }
}
