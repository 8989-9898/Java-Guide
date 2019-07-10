package com.ly.prototype.deepcopy;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.prototype.shallowcopy
 * @ClassName: Main
 * @Author: lin
 * @Description: 深拷贝可以解决在浅拷贝中无法解决引用类型的问题
 * @Date: 2019-07-08 11:18
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume frank = new Resume("Frank");
        frank.setPersonInfo("man","25");
        frank.setWorkExperience("2016-2017","XX公司");
        Resume clone = frank.clone();
        clone.setPersonInfo("man","30");
        Resume resume = frank.clone();
        resume.setWorkExperience("2019-2020","YY企业");
        frank.show();
        resume.show();
        clone.show();
    }
}
