package com.ly.prototype.deepcopy;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.prototype.shallowcopy
 * @ClassName: Resume
 * @Author: lin
 * @Description: 简历类，用于深拷贝
 * @Date: 2019-07-08 11:07
 * @Version: 1.0
 */
public class Resume implements Cloneable{
    private String name;
    private String sex;
    private String age;

    private WorkExperience work;
    public Resume(String name) {
        this.name = name;
        work=new WorkExperience();
    }

    /**
     * 设置个人信息
     *
     * @param sex
     * @param age
     */
    public void setPersonInfo(String sex, String age) {
        this.age = age;
        this.sex = sex;
    }

    /**
     * 设置工作经历
     *
     * @param timeArea
     * @param company
     */
    public void setWorkExperience(String timeArea, String company) {
        work.setCompany(company);
        work.setTimeArea(timeArea);
    }

    /**
     * 显示简历信息
     */
    public void show() {
        System.out.println("姓名:" + name + "性别:" + sex + "年龄:" + age);
        System.out.println("工作经历:" + work.getTimeArea() + work.getCompany());
    }

    @Override
    protected Resume clone() throws CloneNotSupportedException {
        Resume resume = (Resume)super.clone();
        resume.work = work.clone();
        return resume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public WorkExperience getWork() {
        return work;
    }

    public void setWork(WorkExperience work) {
        this.work = work;
    }
}
