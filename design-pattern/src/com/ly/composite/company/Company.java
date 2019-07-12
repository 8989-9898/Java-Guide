package com.ly.composite.company;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.composite.company
 * @ClassName: Company
 * @Author: lin
 * @Description: 公司管理分组架构接口
 * @Date: 2019-07-12 16:11
 * @Version: 1.0
 */
public abstract class Company {
    protected String name;


    /**
     * 加入分组
     * @param company
     */
    public abstract void add(Company company);

    /**
     * 移出分组
     * @param company
     */
    public abstract void remove(Company company);

    /**
     * 输出组织架构
     * @param depth
     */
    public abstract void display(int depth);
    /**
     * 履行职责的方法
     */
    public abstract void lineOfDuty();

    public Company(String name) {
        this.name = name;
    }
}
