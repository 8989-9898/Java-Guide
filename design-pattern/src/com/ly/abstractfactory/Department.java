package com.ly.abstractfactory;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly
 * @ClassName: Department
 * @Author: lin
 * @Description: 代表部门
 * @Date: 2019-07-11 10:20
 * @Version: 1.0
 */
public class Department {
    private Integer id;
    private String name;

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
