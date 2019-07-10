package com.ly.prototype.shallowcopy;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.prototype.shallowcopy
 * @ClassName: Main
 * @Author: lin
 * @Description: 浅拷贝是对值类型的进行逐位复制的，如果时引用类型就时负制引用而不复值对象的，所以在浅拷贝中每个对象中的数据都是一样的
 * @Date: 2019-07-08 11:18
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume frank = new Resume("Frank");
        frank.setPersonInfo("man","25");
        frank.setWorkExperience("2016-2017","XX公司");
        Resume resume = frank.clone();
        resume.setWorkExperience("2019-2020","YY企业");
        Resume clone = frank.clone();
        clone.setPersonInfo("man","30");
        frank.show();
        resume.show();
        clone.show();
    }
}
